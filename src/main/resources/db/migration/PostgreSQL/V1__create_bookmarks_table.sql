create sequence bm_id_sequence start with 1 increment by 50;
create table bookmark (
    id bigint default nextval('bm_id_sequence') not null,
    create_at timestamp(6) with time zone,
    title varchar(255),
    url varchar(255),
    primary key (id)
);
