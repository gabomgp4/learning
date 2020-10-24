create table code
(
    id          int4 not null,
    description varchar(255),
    name        varchar(255),
    owner_id    int4,
    prefix_id   int4,
    primary key (id)
);

alter table if exists enterprise
    add column gln  int8 not null,
    add column name varchar(255),
    add column nit  int8 not null;

create table prefix
(
    id          int4 not null,
    description varchar(255),
    name        varchar(255),
    kind_id     int4,
    primary key (id)
);
create table prefix_kind
(
    id          int4 not null,
    description varchar(255),
    name        varchar(255),
    primary key (id)
);
create sequence hibernate_sequence start 1 increment 1;
alter table if exists code
    add constraint FKs5mm86pbt5ljativxwtx12xky foreign key (owner_id) references enterprise,
    add constraint FKbdn57oph5u6r0iud2xui0cg9c foreign key (prefix_id) references prefix;
alter table if exists prefix
    add constraint FKt3pw2sqfkcefx7cdnunhuhlst foreign key (kind_id) references prefix_kind;