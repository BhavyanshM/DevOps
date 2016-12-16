FROM ubuntu:latest

RUN    apt-get update && apt-get -y install php phpunit php-mysql

CMD cd /pipeline/tests && phpunit /pipeline/tests/Tester.php
