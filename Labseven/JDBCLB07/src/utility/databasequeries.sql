show databases;
create database medicaldb;
use medicaldb;

create table patient(
id int primary key auto_increment,
name varchar(100),
 
gender varchar(10),
patient_type varchar(50));

insert into patient(name, gender, patient_type) values('Robins','Male','Appointment');

select * from patient;	

drop table patient;