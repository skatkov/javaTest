
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
	id MEDIUMINT NOT NULL AUTO_INCREMENT,
	operand_a Int NOT NULL,
	operand_b Int NOT NULL,
	result Int,
	PRIMARY KEY (id)
);	

INSERT INTO operand(operand_a, operand_b) VALUES ('5', '4');
INSERT INTO operand(operand_a, operand_b) VALUES ('3', '9');

CREATE TABLE operations
(
	name varchar(1) NOT NULL,
	description varchar(255),
	PRIMARY KEY (name)
);

INSERT INTO operations VALUES ('+', 'plus');