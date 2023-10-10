BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;

CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE birds (
	bird_id SERIAL,
	bird_name varchar(50) NOT NULL UNIQUE,
	number_of_sightings decimal(10) NOT NULL,
	most_recent_sighting date,
	zip_code varchar (20) NOT NULL,
	bird_image varchar(300) NOT NULL,
	CONSTRAINT PK_bird PRIMARY KEY (bird_id)
);

COMMIT TRANSACTION;
