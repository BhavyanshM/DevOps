FROM ubuntu:latest

RUN    apt-get update && apt-get -y install php-pear && pear install PHP_CodeSniffer

ADD ./ /pipeline/

CMD bash /pipeline/phpcsGadget.sh

EXPOSE 8080

