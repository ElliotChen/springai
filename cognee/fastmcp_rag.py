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
		await client.call_tool("cognify",{"data":"/app/docs/"})
		await client.close()
    	

if __name__ == "__main__":
    asyncio.run(main())