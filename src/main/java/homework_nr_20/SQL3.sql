create table departments(
department_id serial primary key,
department_name varchar(50) not null
);

insert into departments(department_name)
values
('Finance Department'),
('Development'),
('HR'),
('IT services'),
('Learning and development');

select * from departments;

create table employees (
    employee_id serial primary key,
    employee_name varchar(50) not null,
    department_id int,
    foreign key (department_id) references departments(department_id)
);

insert into employees(employee_name,department_id)
values
    ('Serghei Gresu', 1),
	('Dmitrii Vidrov' , 2),
	('Dmitriy Kozlov', 3 ),
	('Maria Ceapa', 4 ),
	('Ecaterina Sovikova',5);

create table projects (
    project_id serial primary key,
    project_name text
);

insert into projects(project_name)
values
('Testing project 1'),
('Testing project 2'),
('Testing project 3'),
('Testing project 4');


create table employee_projects (
    employee_id int,
    project_id int,
    foreign key (employee_id) references employees(employee_id),
    foreign key (project_id) references projects(project_id)
);

insert into employee_projects(employee_id,project_id)
values
(1,1),
(2,2),
(3,3),
(4,4);


select * from employees e
inner join departments d
 on e.employee_id  = d.department_id;

select * from employees e
inner join departments d
 on e.employee_id  = d.department_id
 and e.employee_name =d.department_name
where d.department_id is null;

select d.department_name, e.employee_name
from departments d
inner join employees e
on e.employee_id=d.department_id ;


select department_name,
count (employee_id)
from departments d
inner join employees e
on e.employee_id=d.department_id
group  by department_name ;