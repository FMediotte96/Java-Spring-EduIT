-- Sequence: public."SQ_PERSON"

-- DROP SEQUENCE public."SQ_PERSON";

CREATE SEQUENCE public."SQ_PERSON"
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE public."SQ_PERSON"
  OWNER TO postgres;
GRANT ALL ON SEQUENCE public."SQ_PERSON" TO postgres;
GRANT ALL ON SEQUENCE public."SQ_PERSON" TO public;





CREATE TABLE public."PERSON"
(
   id integer NOT NULL DEFAULT NEXTVAL ('public."SQ_PERSON"'), 
   name character varying(200), 
   country character varying(200), 
   CONSTRAINT pk_person PRIMARY KEY (id)
) 
WITH (
  OIDS = FALSE
)
;
ALTER TABLE public."PERSON"
  OWNER TO postgres;
GRANT ALL ON TABLE public."PERSON" TO public;