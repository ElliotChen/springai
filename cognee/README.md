# Cognee - 簡易的Graph RAG



## 前言

在這個大LLM時代，誰不想要一個私有RAG，最好還是Graph RAG，但是Microsoft的方式太麻煩，一個多月前我找到[Cognee](https://github.com/topoteretes/cognee/)這個專案，而且還提供了MCP的Docker Image，只是....bug有點多，而且image中缺了不少東西，說明也不多，但作者一直有在改（我也一直改他們的....)，但這星期的image，我看到了希望！！

從頭試了一次，確定能用，而且在特定條件下，不用修改就能完成，嗯，在我自己的GraphRAG的效果不夠好的情形下，這應該是個好選擇。

## 準備

需要會的幾件事

1. docker

2. 建議在Local端使用Ollama，模型請找支援tools的

   <img src="https://picgo.ap-south-1.linodeobjects.com/20250606/17165cd10adebc5739b03bc51827a143.png" alt="Screenshot 2025-06-06 at 19.22.24" style="zoom:33%;" />

3. Python 基礎，至少要會用[uv](https://github.com/astral-sh/uv)

4. 一個可加MCP的LLM Client

## 系統檔案結構

![Screenshot 2025-06-09 at 11.43.18](https://picgo.ap-south-1.linodeobjects.com/2025069/61f11ffea0693441e569109a925a305d.png)

### docker compose file

#### docker-compose.yml

### config

#### cognee

1. .env
   ```
   ENV="local"
   
   # LLM Configuration
   LLM_API_KEY="1234"
   LLM_MODEL="Mistral-Small-3.1:latest"
   LLM_PROVIDER="ollama"
   LLM_ENDPOINT="http://host.docker.internal:11434/v1"
   LLM_API_VERSION="v1"
   LLM_MAX_TOKENS="128000"
   LLM_STREAMING="true"
   
   # Embedding Configuration
   EMBEDDING_PROVIDER="ollama"
   EMBEDDING_API_KEY="123"
   EMBEDDING_MODEL="nomic-embed-text:v1.5"
   EMBEDDING_ENDPOINT="http://host.docker.internal:11434/api/embeddings"
   EMBEDDING_API_VERSION=""
   EMBEDDING_DIMENSIONS=768
   EMBEDDING_MAX_TOKENS=8192
   HUGGINGFACE_TOKENIZER="nomic-ai/nomic-embed-text-v1.5"
   
   # "neo4j", "networkx", "kuzu" or "memgraph"
   GRAPH_DATABASE_PROVIDER="neo4j"
   GRAPH_DATABASE_URL=neo4j://neo4j:7687
   GRAPH_DATABASE_USERNAME=neo4j
   GRAPH_DATABASE_PASSWORD=jjjjjjjj
   
   # "qdrant", "pgvector", "weaviate", "milvus", "lancedb" or "chromadb"
   VECTOR_DB_PROVIDER="pgvector"
   
   # Relational Database provider "sqlite" or "postgres"
   DB_PROVIDER="postgres"
   
   # Database name
   DB_NAME=cognee
   
   # Postgres specific parameters (Only if Postgres or PGVector is used). Do not use for cognee default simplest setup of SQLite-NetworkX-LanceDB
   DB_HOST=postgres
   DB_PORT=5432
   DB_USERNAME=postgres
   DB_PASSWORD=postgres
   ```

   

