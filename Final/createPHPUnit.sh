#! /bin/bash

sudo docker build -t gtest ./
sudo docker run -it gtest
