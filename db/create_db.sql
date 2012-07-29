
DROP DATABASE tallink;

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

CREATE TABLE operand
(
	operand_a Int NOT NULL,
	operand_b Int NOT NULL,
	result Int
);	

INSERT INTO operand VALUES ('5', '4', NULL);
INSERT INTO operand VALUES ('3', '9', NULL);

CREATE TABLE operations
(
	name varchar(1) NOT NULL,
	description varchar(255),
	PRIMARY KEY (name)
);

INSERT INTO operations VALUES ('+', 'plus');