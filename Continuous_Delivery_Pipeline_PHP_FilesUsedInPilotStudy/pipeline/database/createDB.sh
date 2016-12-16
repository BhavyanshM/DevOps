#! /bin/bash


sudo docker build -t sql_database ./

sudo docker stop database

sudo docker rm database

sudo docker run -d --name database -p 3306:3306 -v /home/ec2-user/workspace/DevOps/database/:/pipeline/ --privileged sql_database bash /pipeline/setDB.sh
