import asyncio
import httpx
from fastmcp import Client
from fastmcp.client.transports import StreamableHttpTransport

config = {
        'mcpServers': {
            "cognee": {
                "url": "http://localhost:9000/mcp",
                "transport": "http",
                "env": {}
            }
        }
    }
##client = Client(config)

transport_instance = StreamableHttpTransport(url="http://localhost:9000/mcp")
client = Client(transport=transport_instance)

async def main():
	## Trigger cognee 分析/app/docs/目錄下所有檔案
    async with client:
        ##await asyncio.sleep(1)
        await client.call_tool("cognify",{"data":"/var/docs/"})
        ##await client.call_tool("codify",{"repo_path":"/var/docs/"})
        await client.close()
    	

if __name__ == "__main__":
    asyncio.run(main())