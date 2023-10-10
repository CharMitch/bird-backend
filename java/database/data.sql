BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('black-capped Chickadee', '2.0', '02-03-2017', '43081', 'bcchickadee.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('Pacific Wren', '15.0', '01-16-2018', '85138', 'pacificwren.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('American Robin', '213.0', '04-11-2020', '45005', 'americanrobin.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('Bufflehead', '21.0', '11-21-2015', '98230', 'bufflehead.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('Red-bellied Woodpecker', '6.0', '03-12-2017', '02741', 'redbelliedwoodpecker.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('Northern Cardinal', '45.0', '06-02-2019', '78585', 'northerncardinal.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('Eastern Screech-Owl', '4.0', '09-10-2020', '76570', 'easternscreechowl.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('Belted Kingfisher', '13.0', '01-11-2019', '27929', 'beltedkingfisher.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('Carolina Wren', '17.0', '12-26-2019', '45011', 'carolinawren.jpg');
INSERT INTO birds (bird_name, number_of_sightings, most_recent_sighting, zip_code, bird_image ) VALUES ('Anna`s Hummingbird', '6.0', '03-02-2013', '95476', 'annashummingbird.jpg');



COMMIT TRANSACTION;
