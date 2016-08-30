#! /bin/bash

rm /var/www/html/index.html
service apache2 start
cp -r /pipeline/* /var/www/html/


for i in {0..180}
do
sleep 100; 
#echo "Paused";
done

