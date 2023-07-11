CREATE TABLE Sales
(
    ID       SERIAL PRIMARY KEY,
    Product  VARCHAR(50),
    Quantity INTEGER,
    Price    DECIMAL(10, 2)
);

INSERT INTO Sales (Product, Quantity, Price)
VALUES ('Apple', 5, 2.50),
       ('Orange', 3, 1.75),
       ('Banana', 2, 0.50),
       ('Apple', 4, 2.20),
       ('Orange', 2, 1.80);

select *
from Sales;

select Product, sum(Quantity) as TotalQuantity, avg(Price) as AveragePrice
from Sales
GROUP BY Product;

SELECT sum(Price)   as TotalSales,
       avg(Price)   as AveragePrice,
       Min(price)   as MinPrice,
       Max(Price)   as MaxPrice,
       Count(Price) as CountPrice
from sales;

create table Expenses
(
    id       serial primary key,
    category varchar(20),
    amount   decimal(6, 3)
);

insert into Expenses (category, amount)
values ('Transport', 100.45),
       ('Communal', 200.99),
       ('Communal', 300.99),
       ('Communal', 500.99),
       ('Investment', 300.00),
       ('Investment', 600.00),
       ('Investment', 700.00);

select *
from Expenses;

select category, sum(amount) as TotalSum, avg(amount) as AverageAmount
from expenses
group by category;

create table Products
(
    id    serial primary key,
    name  varchar(20),
    price decimal(6, 3)
);

insert into Products (name, price)
values ('Rice', 10.99),
       ('Apple', 2.50),
       ('Orange', 1.75),
       ('Banana', 0.50),
       ('Apple', 2.20),
       ('Orange', 1.80);

select p.name, max(price) as MaxPrice, min(price) MinPrice
from Products p
group by p.name;

create table MaleStudents
(
    id serial primary key ,
    name varchar(20),
    age int,
    grade decimal(5,3)
);

create table FemaleStudents
(
    id serial primary key ,
    name varchar(20),
    age int,
    grade decimal(5,3)
);

insert into MaleStudents (name, age, grade)
values ('Jack', 18, 99.9),
       ('Connor', 19, 80),
       ('Sammuel', 20, 90),
       ('Thomas', 20, 99.9);

insert into FemaleStudents (name, age, grade)
values ('Emma', 18, 80),
       ('Sophia', 20, 99.9),
       ('Ava', 20, 91),
       ('Amelia', 30, 90);

select *
from MaleStudents;

select *
from FemaleStudents;

select name
from MaleStudents
union
select name
from FemaleStudents;

select ms.grade
from MaleStudents ms
intersect
select fs.grade
from femalestudents fs;

select fs.age
from femalestudents fs
except
select ms.age
from malestudents ms;
