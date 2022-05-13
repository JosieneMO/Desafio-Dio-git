CREATE TABLE cliente (
    uuid uuid NOT NULL DEFAULT uuid_generate_V4(),
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone VARCHAR(255) NOT NULL,

    CONSTRAINT cliente_pk PRIMARY KEY (uuid)

)

