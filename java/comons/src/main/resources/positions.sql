create table positions
(
    id           bigserial not null
        constraint positions_pk
            primary key,
    placa        char,
    data_posicao date,
    velocidade   integer,
    latitude     double precision,
    longitude    double precision,
    ignicao      boolean
);

alter table positions
    owner to postgres;

create unique index positions_id_uindex
    on positions (id);

