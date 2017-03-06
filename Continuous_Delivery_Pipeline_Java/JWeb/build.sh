#! /bin/bash

sudo docker build -t jstage ./
sudo docker run -itd -p 80:80 jstage

