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
		await client.call_tool("cognify",{"data":"/app/docs/"})
		await client.close()

    
        
        # Access tools and resources with server prefixes
        #forecast = await client.call_tool("tool-name", {})
    #async with client:
        #await client.call_tool("")
    #async with client:
    	

if __name__ == "__main__":
    asyncio.run(main())