create table classroom(
	building		varchar(15),
	room_number		varchar(7),
	capacity		numeric(4,0),
	primary key (building, room_number)
);
create table book(
	isbn			numeric(13,0),
	title			varchar(50),
	genre			varchar(50),
);
