#! /bin/bash


sudo docker build -t stage /home/ec2-user/workspace/DevOps/tests/stage/

sudo docker stop pipeline_stage

sudo docker rm pipeline_stage

sudo docker run -d --link database:db --name pipeline_stage -v /home/ec2-user/workspace/DevOps/tests/stage/bash:/pipeline/ --privileged -p 80:80 stage

sudo docker cp /home/ec2-user/workspace/DevOps/tests/push/index.php pipeline_stage:/var/www/html/index.php
