CREATE DATABASE db;

CREATE TABLE IF NOT EXISTS contacts
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  address VARCHAR(255) NOT NULL,
  phone_number VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO
	contacts (image, name, address, phone_number)
VALUES
	('KFC_logo-image.svg.png', 'KFC', '1441 Gardiner Lane, Louisville, Kentucky, 40213, United States.', '+1-800-225-5532'),
	('McDonald''s_Golden_Arches.svg.png', 'McDonalds', '110 North Carpenter Street, Chicago, Illinois, 60607, United States.', '+1-800-244-6227' ),
	('Burger_King_2020.svg.png', 'Burger King', '5505 Blue Lagoon Drive, Miami, Florida, 33126, United States.', '+1-866-394-2493');


