--Customers datas
INSERT INTO customer(id,name,secondname,email,password) values 
('1','Pepe', 'Gimenez', 'pgimenez@tecnocampus.cat', '{bcrypt}$2a$10$fVKfcc47q6lrNbeXangjYeY000dmjdjkdBxEOilqhapuTO5ZH0co2');
INSERT INTO customer(id,name,secondname,email,password) values
('2', 'Pepa', 'Pig', 'pepapig@tecnocampus.cat', '{bcrypt}$2a$10$fVKfcc47q6lrNbeXangjYeY000dmjdjkdBxEOilqhapuTO5ZH0co2');
INSERT INTO customer(id,name,secondname,email,password) values
('3', 'Mario', 'Sanchez', 'msanchez@tecnocampus.cat', '{bcrypt}$2a$10$fVKfcc47q6lrNbeXangjYeY000dmjdjkdBxEOilqhapuTO5ZH0co2');

INSERT INTO authorities (username, role) values ('Pepe', 'ROLE_CUSTOMER');
INSERT INTO authorities (username, role) values ('Pepa', 'ROLE_ADMIN');
INSERT INTO authorities (username, role) values ('Mario', 'ROLE_CUSTOMER');
INSERT INTO authorities (username, role) values ('Mario', 'ROLE_ADMIN');
