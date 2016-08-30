FROM ubuntu:latest

RUN    apt-get update && apt-get -y install phpunit

ADD ./ /pipeline/

CMD bash /pipeline/phpunit.sh

EXPOSE 8080

