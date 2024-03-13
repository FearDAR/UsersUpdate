CREATE SEQUENCE users_id_seq;

CREATE TABLE users (
                     id INT DEFAULT NEXTVAL('users_id_seq') PRIMARY key,
                     last_name VARCHAR(225),
                     first_name VARCHAR(225),
                     middle_name VARCHAR(225)
);

comment on table users is 'information about user';
comment on column users.id is 'Unique ID';
comment on column users.last_name is 'last name';
comment on column users.first_name is 'first name';
comment on column users.middle_name is 'middle name';



