#! /bin/bash

rm /var/www/html/index.html
service apache2 start
cp -r /pipeline/* /var/www/html/


while(true)
do
    sleep 10
    ls /var/www/html/
done
