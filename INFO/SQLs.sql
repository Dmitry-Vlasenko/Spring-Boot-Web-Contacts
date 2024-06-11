CREATE DATABASE db;

CREATE TABLE IF NOT EXISTS contacts
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO
	contacts (image, name, description)
VALUES
	('azure-beach.jpg', 'Azure beach', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.'),
	('sunny-club.jpg', 'Sunny Club', 'Donec tempor mi nulla, eu aliquam massa rutrum eu.'),
	('fish-farm.jpg', 'Fish farm', 'Nam tempus ultrices mauris.');


