#! /bin/bash

echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections && \
apt-get install -y oracle-java8-installer
apt-get install -y oracle-java8-set-default
