# cardatabase

## Start a MariaDB Docker instance:
```
docker run --rm -d \
-p 3306:3306 \
--name cardb
-e MYSQL_ROOT_PASSWORD=password \
-e MYSQL_DATABASE=cardb \
mariadb
```

## connect to DB
To connect to the MariaDB using a cli MySQL client start another MariaDB docker container:
```
docker run -it --rm \
--link cardb:mysql \
mariadb \
sh -c 'exec mysql -h"$MYSQL_PORT_3306_TCP_ADDR" -P"$MYSQL_PORT_3306_TCP_PORT" -uroot -p"$MYSQL_ENV_MYSQL_ROOT_PASSWORD"'
```
