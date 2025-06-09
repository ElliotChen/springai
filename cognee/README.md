# Cognee - 簡易的Graph RAG



## 前言

在這個大LLM時代，誰不想要一個私有RAG，最好還是Graph RAG，但是Microsoft的方式太麻煩，一個多月前我找到[Cognee](https://github.com/topoteretes/cognee/)這個專案，而且還提供了MCP的Docker Image，只是....bug有點多，而且image中缺了不少東西，說明也不多，但作者一直有在改（我也一直改他們的....)，但這星期的image，我看到了希望！！

從頭試了一次，確定能用，而且在特定條件下，不用修改就能完成，嗯，在我自己的GraphRAG的效果不夠好的情形下，這應該是個好選擇。

實際檔案可以參考 [Github Elliot SpringAI/Cognee](https://github.com/ElliotChen/springai/tree/master/cognee)

## 準備

需要會的幾件事

1. docker

2. 建議在Local端使用Ollama，模型請找支援tools的

   <img src="https://picgo.ap-south-1.linodeobjects.com/20250606/17165cd10adebc5739b03bc51827a143.png" alt="Screenshot 2025-06-06 at 19.22.24" style="zoom:33%;" />

3. Python 基礎，至少要會用[uv](https://github.com/astral-sh/uv)

4. 一個可加MCP的LLM Client

## 系統檔案結構

![Screenshot 2025-06-09 at 11.43.18](https://picgo.ap-south-1.linodeobjects.com/2025069/61f11ffea0693441e569109a925a305d.png)

## Docker Compose Components

### Cognee MCP

主要注意的

1. *.env*:  Cognee的設定檔，用volume方式掛入
2. *docs*: 要滙入Graph RAG的文件，存放於此，也是用volume掛入，要變更檔案較為容易
3. *stdin_open: true*: 這設定加入後，讓docker外的系統可以用```docker attach $container```連到這個mcp server

### Postgres: pgvector:17

儲存embedding後的資料

### Neo4j

儲存graph data 



## Cognee Configuration

在```config/cognee/.env```裡設定LLM，DB的相關資料。



## Python

### fastmcp_rag.py

```import asyncio
from fastmcp import Client
## 使用docker attach來接入stdio
config = {
        'mcpServers': {
            "cognee": {
                "command": "docker",
                "args": ["attach", "cognee"],
                "env": {}
            }
        }
    }

client = Client(config)

async def main():
	## Trigger cognee 分析/app/docs/目錄下所有檔案
	async with client:
		await client.call_tool("cognify",{"data":"/app/docs/"})
		await client.close()
    	

if __name__ == "__main__":
    asyncio.run(main())
```

執行方式為

```
uv run fastmcp_rag.py
```

在看到docker 裡的cognee動起來後

```
2025-06-09T03:07:34.916903 [info     ] Coroutine task started: `extract_graph_from_data` [run_tasks_base]
2025-06-09T03:07:35.240984 [info     ] Model not found in LiteLLM's model_cost. [cognee.shared.logging_utils]
HTTP Request: POST http://host.docker.internal:11434/v1/chat/completions⁠ "HTTP/1.1 200 OK"
HTTP Request: POST http://host.docker.internal:11434/v1/chat/completions⁠ "HTTP/1.1 200 OK"
2025-06-09T03:11:00.470900 [info     ] Model not found in LiteLLM's model_cost. [cognee.shared.logging_utils]
HTTP Request: POST http://host.docker.internal:11434/v1/chat/completions⁠ "HTTP/1.1 200 OK"
...
```

登入Neo4j可以看到相關的node結構與資料

![Screenshot 2025-06-09 at 11.15.15](https://picgo.ap-south-1.linodeobjects.com/2025069/1f86554b6f3e9e2375bd2a3dddabd042.png)

要快速確認可以用python來看查詢回應，範例如下

```
import asyncio
from fastmcp import Client

config = {
        'mcpServers': {
            "cognee": {
                "command": "docker",
                "args": ["attach", "cognee"],
                "env": {}
            }
        }
    }

client = Client(config)

async def main():
	## 執行查詢
    async with client:
        search_result = await client.call_tool("search",{"search_query": "markdown", "search_type": "RAG_COMPLETION"})
        print(f"Available tools: {search_result}")
        await client.close()
        

if __name__ == "__main__":
    asyncio.run(main())
```

一樣用uv執行

```
> uv run ./fastmcp_search.py

Processing request of type CallToolRequest
2025-06-09T03:28:42.878087 [info     ] Model not found in LiteLLM's model_cost. [cognee.shared.logging_utils]
HTTP Request: POST http://host.docker.internal:11434/v1/chat/completions "HTTP/1.1 200 OK"Available tools: [TextContent(type='text', text='Markdown is a lightweight markup language used for formatting text.', annotations=None)]
```



## LLM 使用

然後在要用的ui去設定mcp，你的agent或tool就能使用graph rag！！！

![Screenshot 2025-06-09 at 12.14.37](https://picgo.ap-south-1.linodeobjects.com/2025069/a01dbe9f86a8cab3c0a75324bca92f72.png)



## 題外話

要設定OpenAI，Claude之外的LLM與Embedding Model會有很多問題，例如想接llama.cpp，會有一堆想到不的情形，最快是改source code，但最後卡在embedding size裡...
