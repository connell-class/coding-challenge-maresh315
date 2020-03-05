-------create a database and a user.
create user challenge_user with password 'p4ssw0rd';

create database challenge_db;

--give that user permissions over db
grant all privileges on database challenge_db to challenge_user;


