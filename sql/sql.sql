/*商家表*/
create table seller(
	id int primary key,
	name varchar(500),
	tel varchar(500),
	address varchar(500),
	website varchar(500),
	star varchar(500),
	business varchar(500)

);
/*商品表*/
create table commodity(
	id number(20) primary key,
	name varchar(500),
	price number(20,2),
	unit varchar(500),
	category varchar(500),
	description varchar(500),
	seller int 
);
alter table commodity add constraint FK_SELLER  foreign key (seller) references seller(id);
/*客户表*/
create table customer(
	id number(20) primary key,
	name varchar(500),
	tel varchar(500),
	address varchar(500),
	email varchar(500),
	sex varchar(500),
	description varchar(500),
	age number(20) ,
	birthday date

);
/*订单表*/
create table orderform(
	id int primary key,
	customer int,
	tradedate date,
	status varchar(500),
	amount number(20,2)
);
alter table orderform add constraint FK_CUSTOMER foreign key (customer) references customer(id);
/*订单明细表*/
create table orderitem(
	id int primary key,
	orderid int,
	commodity int,
	discount number(20,2) ,
	actprice number(20,2),
	amount number(20,2)

);
alter table orderitem add constraint FK_ORDERID foreign key (orderid) references orderform(id);
alter table orderitem add constraint FK_COMMODITY foreign key (commodity) references commodity(id);


