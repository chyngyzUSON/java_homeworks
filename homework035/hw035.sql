/*task A*/

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


/*task B*/

create table student (
	id integer primary key,
	full_name varchar (100) not null,
	student_group integer references group_of_students (id) not null,
	date_of_birth varchar(30) not null
);

insert into student(id, full_name, student_group, date_of_birth) values (001, 'Ermek Nakypov', 20, '2000-01-01');
insert into student(id, full_name, student_group, date_of_birth) values (002, 'Arstanbek Usenov', 20, '2001-01-01');
insert into student(id, full_name, student_group, date_of_birth) values (003, 'Artur Aspekov', 20, '1999-01-01');
insert into student(id, full_name, student_group, date_of_birth) values (004, 'Eliza Churokova', 20, '1990-01-01');
insert into student(id, full_name, student_group, date_of_birth) values (005, 'Rauan maksutov', 20, '1998-01-01');


create table group_of_students (
	id integer primary key,
	faculty integer references faculty (id) unique not null,
	code_group varchar(20) not null
);

insert into group_of_students(id, faculty, code_group) values (20, 999, 'law-20');
insert into group_of_students(id, faculty, code_group) values (30, 666, 'medical-20');
insert into group_of_students(id, faculty, code_group) values (40, 777, 'economical-20');


create table faculty (
	id integer primary key,
	faculty_name varchar(50) not null,
	university integer references university(id) not null
);

insert into faculty (id, faculty_name, university) values (999, 'Law', 12345);
insert into faculty (id, faculty_name, university) values (888, 'Medical', 12345);
insert into faculty (id, faculty_name, university) values (777, 'Economical', 54321);
insert into faculty (id, faculty_name, university) values (666, 'Medical', 54321);

create table university (
	id integer primary key,
	university_name varchar(50) not null
);

insert into university (id, university_name) values (12345, 'AUCA');
insert into university (id, university_name) values (54321, 'Ala-Too');

create table theme (
	id integer primary key,
	theme_name varchar(50) not null
);

insert into theme(id, theme_name) values (444, 'Maths');
insert into theme(id, theme_name) values (555, 'Economy');
insert into theme(id, theme_name) values (666, 'History');


create table assessments (
	id integer primary key,
	student integer references student (id) unique not null,
	assessment real not null,
	theme integer references theme (id) not null
);

insert into assessments(id, student, assessment, theme) values (055, 001, 94.55, 444);
insert into assessments(id, student, assessment, theme) values (066, 002, 86.55, 555);
insert into assessments(id, student, assessment, theme) values (077, 003, 84.55, 444);
insert into assessments(id, student, assessment, theme) values (088, 004, 57.55, 444);
insert into assessments(id, student, assessment, theme) values (099, 005, 67.55, 555);

select avg(assessment) as Average_Assessment from assessments a;
where student = 'Artur Aspekov';

select 	s.full_name,
		g.code_group,
		f.faculty_name,
		u.university_name
		
from 	student s

left join 	group_of_students(code_group),
			faculty(faculty_name),
			university(university_name)
		on 	
		student(full_name) = group_of_students(code_group) and faculty(faculty_name) and university(university_name);
where student.id = '001'
	

			/*additional task*/

/*==============================================================*/
/* table: students                                              */
/*==============================================================*/	
	
create table students(
	student_id 		integer serial 											primary key,
	full_name 		varchar (100) 											not null,
	trainer 		integer				references trainers (trainer_id)	not null,
	reviewer 		integer				references reviewers (reviewer_id) 	not null,
	course 			integer				references courses (course_id) 		not null,
	lesson 			integer				references lessons (lesson_id) 		not null
);
insert into students(student_id, full_name, trainer, reviewer, course, lesson) 
	values (1, 'Uson uulu Chyngyz', 'Sabina Temirbekova', 'Shamil Satarov', );


/*==============================================================*/
/* table: trainers                                              */
/*==============================================================*/
create table trainers(
	trainer_id 		integer serial 											primary key,
	full_name 		varchar (100) 											not null,
	assistant 		integer				references reviewers (reviewer_id) 	not null,
	course 			integer				references courses (course_id) 		not null,
	salary 			integer 												not null
);

insert into trainers(trainer_id, full_name, assistant, course, salary)
		values (1, 'Sabina Temirbekova', 1, 1, 15);
		values (2, 'Sergei Karukes', 2, 2, 15);
		values (3, 'Akbar Azimkhodzhaev', 3, 3, 15);
		values (4, 'Python Pythonova', 4, 4, 15);

/*==============================================================*/
/* table: reviewers                                             */
/*==============================================================*/
create table reviewers(
	reviewer_id		integer	serial											primary key,
	full_name		varchar (100)											not null,
	course			integer				references courses (course_id) 		not null,
	salary			integer 												not null
);

insert into reviewers(reviewer_id, full_name, course, salary)
		values (1, 'Shamil Satarov', 1, 10);
		values (2, 'Rustam Kakharov', 2, 10);
		values (3, 'Aikanysh Satymkulova', 3, 10);
		values (4, 'Python Pythonov', 4, 10);


/*==============================================================*/
/* table: courses                                               */
/*==============================================================*/
create table courses(
	course_id		integer	serial 											primary key,
	name_of_course	varchar (20)											not null,
	course_trainer	integer				references trainers (trainer_id)	not null
);

insert into courses (course_id, name_of_course, course_trainer)
	values (1, 'Java', 1);
	values (2, 'Mobile Dev', 2);
	values (3, 'Front End', 3);
	values (4, 'Python', 4);


/*==============================================================*/
/* table: lessons                                               */
/*==============================================================*/
create table lessons(
	lesson_id 		integer	serial		primary key,
	name_of_lesson 	varchar (50)		not null
);

insert into lessons (lesson_id, name_of_lesson) 
	values (1, 'Theoretical lesson');
	values (2, 'Consulting lesson');
	values (3, 'Practical lesson');


 















