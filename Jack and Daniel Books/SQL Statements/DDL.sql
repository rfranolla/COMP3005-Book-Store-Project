create table publisher
	(publisher_id 		varchar(10),
	 account_number		varchar(20),
	 name 						varchar(20),
	 email						varchar(30),
	 street_number		numeric(9,0),
	 street_name			varchar(20),
	 city							varchar(20),
	 state						varchar(20),
	 zip							varchar(6),
	 primary key (publisher_id, account_number)
 );

 create table author
 	(author_id				varchar(10),
 	 name 						varchar(20),
 	 primary key (author_id)
  );

create table publisher_phone
	(publisher_id 		varchar(10),
	 phone_number			numeric(10,0),
	 type							varchar(20),
	 primary key (publisher_id, phone_number)
  );

create table prder_contains
	(order_id					varchar(10),
	 isbn							numeric(13),
	 primary key (order_id, isbn)
	);

create table owner
	(owner_id					varchar(10),
   name							varchar(20),
	 primary key (owner_id)
  );

create table customer
	(customer_id			varchar(10),
	 first_name				varchar(20),
	 last_name				varchar(20),
	 street_number		numeric(9,0),
	 street_name			varchar(20),
	 city							varchar(20),
	 state						varchar(20),
	 zip							varchar(6),
	 encrypt_password	varchar(20),
	 username					varchar(20),
	 primary key (customer_id, username)
 );

create table book
	(isbn							numeric(13,0),
	 title						varchar(50),
	 genre						varchar(50),
	 price						numeric(4,2),
	 num_pages				numeric(9,0),
	 num_stock				numeric(9,0),
	 sale_percent 		numeric(3,0),
	 year_published		numeric(4,0),
	 publisher_id			varchar(10),
	 author_id				varchar(10),
	 primary key (isbn, title, year_published),
	 foreign key (publisher_id) references publisher,
	 foreign key (author_id) references author
 );

 create table orders
 	(order_number			varchar(10),
 	 date_placed			date,
 	 current_location	varchar(20),
 	 total_cost				numeric(10,2),
 	 customer_id			varchar(10),
 	 primary key (order_number),
 	 foreign key (customer_id) references customer
  );

create table warehouse
	(warehouse_id			varchar(10),
	 name							varchar(20),
	 order_number			varchar(10),
	 primary key (warehouse_id),
	 foreign key (order_number) references orders
 );
