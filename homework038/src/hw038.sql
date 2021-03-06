--task A

create table city(
	city_id int primary key,
	city_name varchar(20)
);

--task B

/*==============================================================*/
/* table: people                                                */
/*==============================================================*/

create table people(
	id 					integer 			primary key,
	full_name 			varchar(70) 		not null,
	birth_date 			timestamp 			not null
);

insert into people (id, full_name, birth_date)
values	(1,		'Biden', 	'2001-01-01'),
		(2, 	'Putin', 	'2002-01-01'),
		(3, 	'Lori', 	'2003-01-01'),
		(4, 	'Blasio', 	'2004-01-01'),
		(5,	 	'Harris', 	'2005-01-01'),
		(6, 	'Sergeev',	'2006-01-01'),
		(7, 	'Musk',		'2007-01-01'),
		(8, 	'Andreev', 	'2008-01-01'),
		(9, 	'Taleb', 	'2009-01-01'),
		(10, 	'Pushkin', 	'2010-01-01');

/*==============================================================*/
/* table: countries                                             */
/*==============================================================*/

create table countries(
	id 					integer 			primary key, 
	name_country 		varchar(50) 		not null,
	country_code 		varchar(10) 		not null,
	country_population 	integer,
	president 			integer 			references people(id)
);

alter table if exists countries
add column country_language varchar(20);

alter table countries 
rename column name_country to country_name;

alter table countries 
rename column id to country_id;

alter table cities 
rename column name_city to city_name;

alter table cities 
rename column id to city_id;

select *
from cities c
join countries cn on cn.country_id = c.country_id 

insert into countries(id, name_country, country_code, country_population, president)
values 	(1,	'United States of America', 	'USA', 	329484123, 	1),
		(2, 'Russian Federation',  			'RUS', 	144500000,	2);
		
/*==============================================================*/
/* table: cities                                                */
/*==============================================================*/

create table cities(
	id 					integer 			primary key,
	name_city 			varchar(50) 		not null,
	country_id 			integer 			references countries(id),
	mayor	 			integer 			references people(id),
	city_population 	integer
);

insert into cities(id, name_city, country_id, mayor, city_population)
values 	(1, 'New-York', 1, 	4, 	20610000),
		(2, 'Moscow', 	2, 	6, 	11920000),
		(3, 'Chicago', 	1, 	3, 	 2695598);

select *
from cities
where name_city like '%c%';

select sum(city_population) as "Население всех городов"
from cities;

