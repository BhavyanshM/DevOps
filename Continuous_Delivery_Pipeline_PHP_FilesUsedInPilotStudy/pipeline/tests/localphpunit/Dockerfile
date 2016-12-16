FROM ubuntu:latest

RUN    apt-get update && apt-get -y install phpunit

CMD cd /pipeline/tests && phpunit /pipeline/tests/localTester.php

EXPOSE 8080
