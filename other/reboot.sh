#! /bin/bash

sudo service docker restart

echo "The script was ran at $(date)" >> /home/ec2-user/workspace/log.reboot

rm /home/ec2-user/temp

sudo docker stop $(sudo docker ps -aq)

sudo docker rm $(sudo docker ps -aq)

sudo docker rmi -f $(sudo docker images -aq)

cd /home/ec2-user/workspace/JDatabase

sudo bash /home/ec2-user/workspace/JDatabase/build.sh

