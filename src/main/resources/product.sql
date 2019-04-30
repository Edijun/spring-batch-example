-- Table: public.product

-- DROP TABLE public.product;

CREATE TABLE public.product
(
    id character varying(10) COLLATE pg_catalog."default" NOT NULL,
    name character varying(50) COLLATE pg_catalog."default",
    price integer,
    description character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT product_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.product
    OWNER to postgres;