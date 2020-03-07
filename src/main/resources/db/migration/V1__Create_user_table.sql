create table user
(
	id int auto_increment primary key not null,
	name varchar(50),
	accound_id varchar(100),
	token char(36),
	create_timestamp BIGINT,
	update_timestamp BIGINT
);

