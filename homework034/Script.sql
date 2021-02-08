create table visitor(
	id integer primary key,
	full_name varchar (100) not null,
	date_of_birth varchar(30) not null,
	gender varchar(20) not null
);

insert into visitor(id, full_name, date_of_birth, gender) values (1, 'Chyngyz Usonuulu', '1992-02-28', 'male');
insert into visitor(id, full_name, date_of_birth, gender) values (2, 'Elgiz Usonuulu', '1994-08-07', 'male');
insert into visitor(id, full_name, date_of_birth, gender) values (3, 'Ernazar Usonuulu', '2002-12-22', 'male');
insert into visitor(id, full_name, date_of_birth, gender) values (4, 'Gulnur Usonkyzy', '2004-05-02', 'female');

create table visit (
	id integer primary key,
	visitor integer not null references visitor(id),
	visit_time timestamp not null,
	trainer integer not null references trainers(trainer_id)
);

insert into visit(id, visitor, visit_time, trainer) values (1, 1, '2021-02-05 00:35:00', 4);
insert into visit(id, visitor, visit_time, trainer) values (2, 2, '2021-02-05 02:55:00', 5);
insert into visit(id, visitor, visit_time, trainer) values (3, 3, '2021-02-05 07:40:00', 6);
insert into visit(id, visitor, visit_time, trainer) values (4, 4, '2021-02-05 08:35:00', 7);
insert into visit(id, visitor, visit_time, trainer) values (5, 2, '2021-02-05 12:35:00', 8);

select visitor.full_name, trainers.trainer_full_name, visit.visit_time
from visit v
left join trainers on visitor.id = trainers.trainer_id;
join visit on trainers.trainer_id = visit.id 
where trainers.sport_type_id = '4'
order by visit.visit_time desc 