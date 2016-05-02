INSERT INTO travelplanner.ROLE(id, name) VALUES (1, 'Admin');
INSERT INTO travelplanner.ROLE(id, name) VALUES (2, 'Regular User');
INSERT INTO travelplanner.ROLE(id, name) VALUES (3, 'User Manager');

INSERT INTO travelplanner.USER(id, email, password) VALUES('067e6162-3b6f-4ae2-a171-2470b63dff00', 'manoel.menezes.jr@gmail.com', '123456');

INSERT INTO travelplanner.USER_ROLE(user_id, role_id) VALUES('067e6162-3b6f-4ae2-a171-2470b63dff00', 1);