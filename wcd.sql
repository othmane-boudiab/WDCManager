--
-- PostgreSQL database dump
--

-- Dumped from database version 12.9 (Ubuntu 12.9-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.9 (Ubuntu 12.9-0ubuntu0.20.04.1)

-- Started on 2022-03-08 11:52:11 +01

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 210 (class 1259 OID 44747)
-- Name: activite; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public.activite (
    id integer NOT NULL,
    titre text,
    descriptif text,
    date_debut date,
    date_fin date,
    etat boolean,
    "type-act" integer
);


ALTER TABLE public.activite OWNER TO dev_oth;

--
-- TOC entry 209 (class 1259 OID 44745)
-- Name: activite_id_seq; Type: SEQUENCE; Schema: public; Owner: dev_oth
--

ALTER TABLE public.activite ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.activite_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 203 (class 1259 OID 44709)
-- Name: utilisateur; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public.utilisateur (
    id integer NOT NULL,
    nom text,
    prenom text,
    telephone text,
    email text,
    password text,
    role integer
);


ALTER TABLE public.utilisateur OWNER TO dev_oth;

--
-- TOC entry 208 (class 1259 OID 44739)
-- Name: administrateur; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public.administrateur (
    etat boolean
)
INHERITS (public.utilisateur);


ALTER TABLE public.administrateur OWNER TO dev_oth;

--
-- TOC entry 214 (class 1259 OID 44767)
-- Name: exercice; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public.exercice (
    id integer NOT NULL,
    date_debut date,
    date_fin date,
    statut boolean,
    "id-act" integer
);


ALTER TABLE public.exercice OWNER TO dev_oth;

--
-- TOC entry 213 (class 1259 OID 44765)
-- Name: exercice_id_seq; Type: SEQUENCE; Schema: public; Owner: dev_oth
--

ALTER TABLE public.exercice ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.exercice_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 207 (class 1259 OID 44733)
-- Name: participant; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public.participant (
    domaine text,
    structure text
)
INHERITS (public.utilisateur);


ALTER TABLE public.participant OWNER TO dev_oth;

--
-- TOC entry 206 (class 1259 OID 44727)
-- Name: responsable; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public.responsable (
    etat boolean,
    type integer
)
INHERITS (public.utilisateur);


ALTER TABLE public.responsable OWNER TO dev_oth;

--
-- TOC entry 205 (class 1259 OID 44719)
-- Name: role; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public.role (
    id integer NOT NULL,
    role text
);


ALTER TABLE public.role OWNER TO dev_oth;

--
-- TOC entry 204 (class 1259 OID 44717)
-- Name: role_id_seq; Type: SEQUENCE; Schema: public; Owner: dev_oth
--

ALTER TABLE public.role ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 212 (class 1259 OID 44757)
-- Name: type; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public.type (
    id integer NOT NULL,
    type text
);


ALTER TABLE public.type OWNER TO dev_oth;

--
-- TOC entry 216 (class 1259 OID 44784)
-- Name: type-act; Type: TABLE; Schema: public; Owner: dev_oth
--

CREATE TABLE public."type-act" (
    id integer NOT NULL,
    type text
);


ALTER TABLE public."type-act" OWNER TO dev_oth;

--
-- TOC entry 215 (class 1259 OID 44782)
-- Name: typeAct_id_seq; Type: SEQUENCE; Schema: public; Owner: dev_oth
--

ALTER TABLE public."type-act" ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."typeAct_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 211 (class 1259 OID 44755)
-- Name: type_id_seq; Type: SEQUENCE; Schema: public; Owner: dev_oth
--

ALTER TABLE public.type ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 202 (class 1259 OID 44707)
-- Name: utilisateur_id_seq; Type: SEQUENCE; Schema: public; Owner: dev_oth
--

ALTER TABLE public.utilisateur ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.utilisateur_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 2887 (class 2606 OID 44754)
-- Name: activite activite_pkey; Type: CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.activite
    ADD CONSTRAINT activite_pkey PRIMARY KEY (id);


--
-- TOC entry 2891 (class 2606 OID 44771)
-- Name: exercice exercice_pkey; Type: CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.exercice
    ADD CONSTRAINT exercice_pkey PRIMARY KEY (id);


--
-- TOC entry 2885 (class 2606 OID 44726)
-- Name: role role_pkey; Type: CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.role
    ADD CONSTRAINT role_pkey PRIMARY KEY (id);


--
-- TOC entry 2893 (class 2606 OID 44791)
-- Name: type-act typeAct_pkey; Type: CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public."type-act"
    ADD CONSTRAINT "typeAct_pkey" PRIMARY KEY (id);


--
-- TOC entry 2889 (class 2606 OID 44764)
-- Name: type type_pkey; Type: CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.type
    ADD CONSTRAINT type_pkey PRIMARY KEY (id);


--
-- TOC entry 2883 (class 2606 OID 44716)
-- Name: utilisateur utilisateur_pkey; Type: CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.utilisateur
    ADD CONSTRAINT utilisateur_pkey PRIMARY KEY (id);


--
-- TOC entry 2897 (class 2606 OID 44797)
-- Name: exercice id-act; Type: FK CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.exercice
    ADD CONSTRAINT "id-act" FOREIGN KEY ("id-act") REFERENCES public.activite(id) NOT VALID;


--
-- TOC entry 2894 (class 2606 OID 44772)
-- Name: utilisateur role; Type: FK CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.utilisateur
    ADD CONSTRAINT role FOREIGN KEY (role) REFERENCES public.role(id) NOT VALID;


--
-- TOC entry 2895 (class 2606 OID 44802)
-- Name: responsable type; Type: FK CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.responsable
    ADD CONSTRAINT type FOREIGN KEY (type) REFERENCES public.type(id) NOT VALID;


--
-- TOC entry 2896 (class 2606 OID 44807)
-- Name: activite type-act; Type: FK CONSTRAINT; Schema: public; Owner: dev_oth
--

ALTER TABLE ONLY public.activite
    ADD CONSTRAINT "type-act" FOREIGN KEY ("type-act") REFERENCES public."type-act"(id) NOT VALID;


-- Completed on 2022-03-08 11:52:11 +01

--
-- PostgreSQL database dump complete
--

