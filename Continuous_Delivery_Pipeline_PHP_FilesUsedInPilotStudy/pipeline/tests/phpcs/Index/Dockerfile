FROM ubuntu:latest

RUN    apt-get update && apt-get -y install php-pear && pear install PHP_CodeSniffer

CMD phpcs /pipeline/index/index.php

EXPOSE 8080
