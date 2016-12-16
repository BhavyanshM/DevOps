FROM ubuntu:latest

RUN    apt-get update && apt-get -y install php-pear && pear install PHP_CodeSniffer

CMD phpcs /pipeline/tests/Tester.php

EXPOSE 8080
