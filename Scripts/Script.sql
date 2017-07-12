create database project;

create table project(
	project_no int(11) not null auto_increment,
	project_name varchar(50) not null,
	project_content varchar(255) not null,
	startdate datetime not null,
	enddate datetime not null,
	projecting varchar(20) not null
);
select *from project;
