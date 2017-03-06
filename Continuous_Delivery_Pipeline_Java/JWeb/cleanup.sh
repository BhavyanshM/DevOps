#! /bin/bash

sudo docker stop $(sudo docker ps -a -q)
sudo docker rmi -f $(sudo docker images -a)
