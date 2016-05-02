CREATE SCHEMA travelplanner;

CREATE TABLE travelplanner.USER (id VARCHAR(36) PRIMARY KEY, email VARCHAR(60) UNIQUE NOT NULL, password VARCHAR(8) NOT NULL);

CREATE TABLE travelplanner.TRIP (id VARCHAR(36) PRIMARY KEY, destination VARCHAR(60) NOT NULL, start_date DATE NOT NULL, end_date DATE NOT NULL, comment VARCHAR(500), user_id VARCHAR(36) NOT NULL);

CREATE TABLE travelplanner.ROLE(id INTEGER PRIMARY KEY, name VARCHAR(20) NOT NULL);

CREATE TABLE travelplanner.USER_ROLE(user_id VARCHAR(36) NOT NULL, role_id INTEGER NOT NULL);

ALTER TABLE travelplanner.TRIP ADD CONSTRAINT fk_trip_user FOREIGN KEY (user_id) REFERENCES travelplanner.USER (id) ON DELETE CASCADE;

ALTER TABLE travelplanner.USER_ROLE ADD CONSTRAINT fk_user_role_user FOREIGN KEY (user_id) REFERENCES travelplanner.USER (id) ON DELETE CASCADE;

ALTER TABLE travelplanner.USER_ROLE ADD CONSTRAINT fk_user_role_role FOREIGN KEY (role_id) REFERENCES travelplanner.ROLE (id);