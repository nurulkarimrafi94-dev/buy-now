## Command to start postgres

docker run -d \
--name postgres \
-e POSTGRES_USER=user \
-e POSTGRES_PASSWORD=user \
-e POSTGRES_DB=productdb \
-p 5432:5432 \
-v pgdata:/var/lib/postgresql/data \
postgres:latest