CREATE TABLE students ( id int primary key,name varchar(20), cgpa float);  
insert into students values	(1,"abhishek",7.56); 
insert into students value(2,"deepak",8.88);
insert into students value(3,"shekhar",8.45);
insert into students value(4,"yogita",8.32);
update students set cgpa=8.56 where id=1;
CREATE TABLE courses (  course_no int primary key,course_name varchar(20), fees int);
insert into courses value(1,"java",12000);
insert into courses value(2,"js",10000);
insert into courses value(3,"angularjs",15000);
insert into courses value(4,"servlet",20000);
select * from courses;
select * from students;
alter table students add course_no int;
alter table students add foreign key (course_no) references courses(course_no);
update students set course_no=2 where id=3;
update students set course_no=4 where id=4;


use swabhav;
CREATE TABLE college (college_id int primary key,name varchar(20),location varchar(20));
CREATE TABLE professors (professor_id int primary key,name varchar(20),college_id int);
alter table professors add foreign key (college_id) references college(college_id);
CREATE TABLE student (student_id int primary key,name varchar(20),college_id int);
alter table student add foreign key (college_id) references college(college_id);
insert into college value(1,"vit","wadala");
insert into student value(1,"abhishek",1);
insert into student value(2,"deepak",1);
insert into student value(3,"shekhar",1);
insert into professors value(1,"abc",1);
select * from college;
select * from student;
select * from professors;

create table customer(customer_id int primary key,customer_name varchar(20));
create table orders (order_id int primary key,cost int,customer_id int, foreign key (customer_id) references customer(customer_id));
create table product (product_id int primary key,product_name varchar(20),price int);
create table lineitem (lineitem_id int primary key,quantity int,product_id int, foreign key (product_id) references product(product_id));
alter table lineitem add foreign key (order_id) references orders(order_id);
alter table lineitem add order_id int;

select * from product ;
select * from customer ;
select * from lineitem;
select * from orders;

insert into customer value (1,"abhishek");
insert into customer value (2,"deepak");

insert into product value (101,"tshirt",500);
insert into product value(102,"watch",2000);
insert into product value(103,"pant",600);

insert into orders value(250,2000,1);
insert into orders value(251,3200,2);

insert into lineitem value(111,4,101,250);
insert into lineitem value(112,1,102,251);
insert into lineitem value(113,2,103,251);



CREATE TABLE CUSTOMERS(
FIRSTNAME VARCHAR(20),
LASTNAME VARCHAR(20),
ID VARCHAR(20) PRIMARY KEY ,
DOB VARCHAR(20),
BALANCE DOUBLE,
CARDTYPE VARCHAR(20));

INSERT INTO CUSTOMERS VALUE( "ABHISHEK","LONDHE","1","26/5/96",2000,"DEBIT");
INSERT INTO CUSTOMERS VALUE( "DEEPAK","GUPTA","2","24/6/95",5000,"CREDIT");
INSERT INTO CUSTOMERS VALUE( "SHEKHAR","PATIL","3","6/7/96",4000,"DEBIT");
INSERT INTO CUSTOMERS VALUE( "YOGITA","MORE","4","2/12/96",7000,"CREDIT");
	SELECT * FROM CUSTOMERS;

CREATE TABLE USERS(
ID INT PRIMARY KEY,
USERNAME VARCHAR(20),
PASSWORD VARCHAR(20),
ROLE VARCHAR(20)
)

INSERT INTO USERS VALUE(1,"ADMIN","ADMIN","ADMIN");
INSERT INTO USERS VALUE(2,"USER","USER123","USER");

SELECT * FROM USERS;

alter table customers modify id varchar(50);





CREATE TABLE VENDOR(
ID INT PRIMARY KEY,
NAME VARCHAR(20),
BALANCE VARCHAR(20)
)


INSERT INTO VENDOR VALUES (101,"DMART",500000);
SELECT * FROM VENDOR;
select * from customers;

