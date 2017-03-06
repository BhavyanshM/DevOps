FROM ubuntu:latest

ADD ./ /maven/

RUN apt-get update -y && apt-get upgrade -y && apt-get install -y software-properties-common && add-apt-repository -y ppa:webupd8team/java && apt-get update -y && apt-get install -y maven 
RUN bash /maven/setup_maven.sh

#Setup maven sample project
#RUN mvn archetype:generate -B -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.1 -DgroupId=com.company -DartifactId=project -Dversion=1.0-SNAPSHOT -Dpackage=com.company.project

#Run the Java application
#RUN pwd
#WORKDIR /project/
#RUN mvn compile
#RUN mvn package
#WORKDIR /project/target/
#CMD java -cp project-1.0-SNAPSHOT.jar com.company.project.App

