FROM ubuntu:latest

ADD ./ /maven/

RUN apt-get update -y && apt-get upgrade -y && apt-get install -y software-properties-common && add-apt-repository -y ppa:webupd8team/java && apt-get update -y && apt-get install -y wget unzip nano 
RUN bash /maven/setup_maven.sh

RUN bash /maven/pmd.sh

