CREATE TABLE tbl_regions ( 
   id INT NOT NULL auto_increment, 
   primary key(id),
   name VARCHAR(50) NULL
);

CREATE TABLE tbl_customers (
	id INT NOT NULL auto_increment, 
	primary key(id),
	number_id INT NULL, 
	first_name VARCHAR(50) NOT NULL, 
	last_name VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	region_id INT NULL, 
	state VARCHAR(10) NULL
);


INSERT INTO tbl_regions (id, name) VALUES (1, 'Sudamérica');
INSERT INTO tbl_regions (id, name) VALUES (2, 'Centroamérica');
INSERT INTO tbl_regions (id, name) VALUES (3, 'Norteamérica');
INSERT INTO tbl_regions (id, name) VALUES (4, 'Europa');
INSERT INTO tbl_regions (id, name) VALUES (5, 'Asia');
INSERT INTO tbl_regions (id, name) VALUES (6, 'Africa');
INSERT INTO tbl_regions (id, name) VALUES (7, 'Oceanía');
INSERT INTO tbl_regions (id, name) VALUES (8, 'Antártida');

INSERT INTO tbl_customers (id,number_id,first_name,last_name , email, region_id, state) VALUES(1,'32404580', 'Andrés', 'Guzmán', 'profesor@bolsadeideas.com',1,'CREATED');
INSERT INTO tbl_customers (id,number_id,first_name,last_name , email, region_id, state) VALUES(2,'32404581', 'Germán', 'Gutiérrez', 'german@codehaus.it.com',6,'CREATED');