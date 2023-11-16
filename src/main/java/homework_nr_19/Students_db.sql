create table students(
studentID serial primary key,
name text not null,
surname text not null,
age int not null,
sex text not null
);
insert into students
(name,surname,age,sex)
values
('Alice','Smith',20,'Female'),
('Bob','Johnson',22,'Male'),
('Charlie','Brown',19, 'Male'),
('Diana','Lee',21,'Female'),
('Emily','Davis',23,'Female');

update  students
set age = 24
where studentid=5;
select * from students;

delete from students
where surname = 'Brown';

select name, age
from students
where sex = 'Female';

select name
from students
where surname like 'C%';

select * from students;