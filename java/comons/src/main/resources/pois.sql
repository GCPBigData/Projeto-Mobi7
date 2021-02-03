-- Table: public.pois

-- DROP TABLE public.pois;

CREATE TABLE public.pois
(
    id bigint NOT NULL DEFAULT nextval('pois_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default",
    raio bigint,
    latitude double precision,
    longitude double precision,
    CONSTRAINT pois_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.pois
    OWNER to postgres;