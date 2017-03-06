#! /bin/bash
rm -rf Music2
cp -r /home/ec2-user/Java/Medium/Music_Maven ./
sudo docker build -t jpipeline .
sudo docker run -it jpipeline
