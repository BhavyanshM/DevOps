#! /bin/bash

sudo docker exec -d pipeline_stage bash /pipeline/createDIR.sh $1
sudo docker cp /home/ec2-user/workspace/jenkins_pipeline/$1/index/ pipeline_stage:/var/www/html/$1/


sudo docker cp /home/ec2-user/workspace/DevOps/tests/push/index.php pipeline_stage:/var/www/html/$1/index.php
