#! /bin/bash
sudo docker rmi -f jstatic
rm -rf MediumFX
cp -r /home/ec2-user/workspace/Medium/MediumFX ./
sudo docker build -t jstatic .
sudo docker run -it jstatic
