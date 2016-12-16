FROM ubuntu:latest

RUN apt-get update && apt-get -y install apache2 && apt-get -y install php libapache2-mod-php php-mysql nano vim

CMD bash /pipeline/stage.sh

EXPOSE 80

ADD ./backUps/ /var/www/html/
