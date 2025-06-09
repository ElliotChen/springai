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

    async with client:
        #tools = await client.list_tools()
        #print(f"Available tools: {tools}")
        search_result = await client.call_tool("search",{"search_query": "markdown", "search_type": "RAG_COMPLETION"})
        print(f"Available tools: {search_result}")
        await client.close()
        

if __name__ == "__main__":
    asyncio.run(main())