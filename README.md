# cardatabase

## Start a MariaDB Docker instance:
```
docker run --rm -d \
-p 3306:3306 \
--name cardb \
-e MYSQL_ROOT_PASSWORD=password \
-e MYSQL_DATABASE=cardb \
mariadb
```

