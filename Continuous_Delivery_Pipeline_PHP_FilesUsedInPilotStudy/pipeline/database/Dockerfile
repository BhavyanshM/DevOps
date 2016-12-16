FROM ubuntu:latest

RUN echo "mysql-server mysql-server/root_password password chocolate" | debconf-set-selections

RUN echo "mysql-server mysql-server/root_password_again password chocolate" | debconf-set-selections

RUN apt-get update && apt-get -y upgrade && apt-get -y install mysql-server && apt-get -y install nano vim

CMD bash /pipeline/setDB.sh

EXPOSE 3306
