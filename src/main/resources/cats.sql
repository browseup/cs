Create table cat (
id serial primary key,
name varchar(255),
color varchar(50),
age int,
description varchar(255));
Create table lost_cat (
id serial primary key,
cat_id int,
user_id int);
Create table users (
id serial primary key,
login varchar(255),
password varchar(255),
name varchar(255));
insert into users(login, password, name)
values('admin', 'admin', 'vasya');
insert into users(login, password, name)
values('user', 'user', 'kolya');
insert into users(login, password, name)
values('user1', 'user1', 'lili');