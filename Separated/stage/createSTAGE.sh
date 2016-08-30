#! /bin/bash


sudo docker build -t stage ./

sudo docker stop pipeline_stage

sudo docker rm pipeline_stage

sudo docker run --name pipeline_stage --privileged -p 80:80 stage
