CREATE TABLE Customer (
  id int NOT NULL,
  name varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
) 

CREATE TABLE Address (
  id int  NOT NULL,
  address varchar(100) DEFAULT NULL,
  country varchar(100) DEFAULT NULL,
  PRIMARY KEY (id))