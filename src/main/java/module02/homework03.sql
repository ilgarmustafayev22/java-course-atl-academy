create table Products
(
    ProductID   serial primary key,
    Name        varchar(20),
    Price       decimal,
    Quantity    int,
    Description varchar(20)
);

create table Categories
(
    CategoryID serial primary key,
    Name       varchar(20),
    foreign key (CategoryID) references Products (ProductID)
);

create table Customers
(
    CustomerID  serial primary key,
    FirstName   varchar(20),
    LastName    varchar(20),
    Address     varchar(20),
    Email       varchar
        constraint proper_email CHECK (email ~* '^[A-Za-z0-9._+%-]+@[A-Za-z0-9.-]+[.][A-Za-z]+$'),
    PhoneNumber numeric(15)
);

create table Orders
(
    OrderID    serial primary key,
    CustomerID int references Customers (CustomerID),
    OrderDate  date
);

create table OrderDetails
(
    OrderDetailID serial primary key,
    OrderID       int references Orders (OrderID),
    ProductID     int references Products (ProductID),
    Quantity      int
);

INSERT INTO Products (Name, Price, Quantity, Description)
VALUES ('Product A', 10.99, 10, 'Modern'),
       ('Product B', 25.99, 20, 'New'),
       ('Product C', 5.99, 25, 'Ancient');

insert into Categories (Name)
values ('Electronics'),
       ('Home & Garden'),
       ('Books');

INSERT INTO Customers (FirstName, LastName, Address, Email, PhoneNumber)
VALUES ('Bob', 'Carlos', 'Germany', 'info@acme.com', 123 - 456 - 7890),
       ('John', 'Wilson', 'England', 'info@xyz.com', 987 - 654 - 3210),
       ('Mike', 'Corleone', 'Italy', 'info@abc.com', 555 - 555 - 5555);

insert into Orders (CustomerID, OrderDate)
values (1, '2023-06-01'),
       (2, '2023-06-05'),
       (3, '2023-06-10');

insert into OrderDetails (OrderID, ProductID, Quantity)
values (1, 3, 8),
       (2, 1, 5),
       (3, 1, 10);

--Get a list of all products.
select *
from Products;

--Get a list of all categories of products.
select *
from Categories;

--Get a list of all customers.
select *
from Customers;

--Get a list of all orders.
select *
from Orders;

--Get a list of all order details.
select *
from Orderdetails;

--Get information about a specific product by its ID.
select *
from Products
where ProductID = 1;

--Get a list of products in a specific category.
select *
from Products
         join Categories C on Products.ProductID = C.CategoryID;

--Get information about a customer by their ID.
select *
from Customers
where CustomerID = 2;

--Get a list of orders for a specific customer.
select *
from Customers
         join Orders O on Customers.CustomerID = O.CustomerID
where O.CustomerID = 2;

--Get a list of order details for a specific order.
select *
from Orders
         join OrderDetails OD on Orders.OrderID = OD.OrderID
where OD.OrderID = 3;

--Update the price of a product by its ID.
update Products
set Price = 15.99
where ProductID = 1;

--Add a new product.
insert into Products (Name, Price, Quantity, Description)
values ('Product D', 20.99, 5, 'Liquid');

--Delete a product by its ID.
delete
from Products
where ProductID = 4;
