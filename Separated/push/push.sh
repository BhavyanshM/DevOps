#! /bin/bash

sudo docker exec -d pipeline_stage bash /pipeline/createDIR.sh $1
sudo docker cp ./index/ pipeline_stage:/var/www/html/$1/
sudo docker cp ./index.php pipeline_stage:/var/www/html/$1/index.php
sudo docker cp ./index.php pipeline_stage:/var/www/html/index.php

