create table person
(
    id bigserial not null primary key,
    first_name varchar(10) not null ,
    last_name varchar(10) not null ,
    gender varchar(5) not null ,
    date_of_birth date check ( date_of_birth > 1800 )
);

insert into person(first_name, last_name, gender, date_of_birth)
values ('Samir', 'Bagirov', '?' ,'09.09.1900');

select * from person;