INSERT INTO travelplanner.ROLE(id, name) VALUES (1, 'Admin');
INSERT INTO travelplanner.ROLE(id, name) VALUES (2, 'Regular User');
INSERT INTO travelplanner.ROLE(id, name) VALUES (3, 'User Manager');

INSERT INTO travelplanner.USER(id, email, password) VALUES('067e6162-3b6f-4ae2-a171-2470b63dff00', 'manoel.menezes.jr@gmail.com', '123456');

INSERT INTO travelplanner.USER_ROLE(user_id, role_id) VALUES('067e6162-3b6f-4ae2-a171-2470b63dff00', 1);

INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('be80d7cb-d2a3-4cd2-9106-e4413988eba3', 'Aracaju', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('bdb7b91f-65b7-41b1-b785-9fd3503f9e91', 'Salvador', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('70a73e54-1f42-4ae4-ac58-397118fdd84c', 'Recife', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('9e315d79-0a0b-4730-8f82-3c0b771fb693', 'Campina Grande', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('4470eea2-ad2c-4575-a24d-cc0c02ca1270', 'Maceio', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('1314ce19-212d-4f9a-b4f1-cc6ea4933b5c', 'Fortaleza', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('b6860f93-c817-487b-8e9c-c11f75e9717f', 'Joao Pessoa', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('30d10ed1-17e7-45f1-b25a-a9b5b51fc042', 'Natal', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('6f5ccae6-ef32-4a02-9d06-8a6bcbe5d6ee', 'Teresina', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('c11436e1-eaff-4d90-b95b-9f4c41d182be', 'Sao Luis', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');
INSERT INTO travelplanner.TRIP(id, destination, start_date, end_date, comment, user_id) VALUES('04da0c2f-b8f7-4843-bd99-9df7fcf1898c', 'Sao Cristovao', CURRENT_DATE, CURRENT_DATE, null, '067e6162-3b6f-4ae2-a171-2470b63dff00');




