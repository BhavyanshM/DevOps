FROM ubuntu:latest

RUN apt-get update && apt-get -y install apache2 && apt-get -y install php5

ADD ./bash/ /pipeline/

CMD bash /pipeline/stage.sh

EXPOSE 80
