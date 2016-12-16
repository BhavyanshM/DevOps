#! /bin/bash

sudo docker stop database
sudo docker stop pipeline_stage

docker rmi -f $(docker images -a)

rm -fr ./workspace/*@*

cd /home/ec2-user/workspace/DevOps/database
bash /home/ec2-user/workspace/DevOps/database/createDB.sh

cd /home/ec2-user/workspace/DevOps/tests/stage
bash /home/ec2-user/workspace/DevOps/tests/stage/createSTAGE.sh

echo "rebooted" >> /home/ec2-user/workspace/Test/log/log
/usr/bin/uptime >> /home/ec2-user/workspace/Test/log/log

cd /home/ec2-user/workspace/Test
git add -A
git commit -m "Reboot"
git push git@github.com:ncoop57/Test.git

