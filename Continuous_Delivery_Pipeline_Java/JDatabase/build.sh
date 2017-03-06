#! /bin/bash

sudo docker build -t jdatabase ./
sudo docker run -itd -p 8080:3306 jdatabase

