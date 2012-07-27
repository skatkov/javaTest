CREATE DATABASE tallink;

GRANT ALL PRIVILEGES
ON tallink.*
TO 'tallink_user'@'localhost'
IDENTIFIED BY 'tallink_pass'
WITH GRANT OPTION;

GRANT ALL PRIVILEGES
ON tallink.*
TO 'tallink'@'%'
IDENTIFIED BY 'tallink_pass'
WITH GRANT OPTION;

USE tallink;