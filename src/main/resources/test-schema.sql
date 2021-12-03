drop table if exists plant CASCADE;
create table plant
(
   id integer auto_increment,
   name varchar (255),
   quantity integer not null,
   colour varchar (255),
   country_of_origin varchar (255),
   watering_frequency integer not null,
   primary key (id)
);