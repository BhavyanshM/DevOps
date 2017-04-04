#! /bin/bash


apt-get -y install git
cd /maven
git clone https://github.com/BhavyanshM/Medium.git
cd /maven/MediumFX/
mvn clean compile assembly:single
mvn package
cd /maven/
rm ./Medium/*.jar
cp ./MediumFX/target/*.jar Medium
git config --global user.name "BhavyanshM"
git config --global user.email bhavyanshmishra@gmail.com
cd /maven/Medium/
git add -A
git commit -m "Add JARs Built"
git push
