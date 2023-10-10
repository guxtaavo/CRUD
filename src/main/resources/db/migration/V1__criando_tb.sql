CREATE TABLE medicos (
    id bigint AUTO_INCREMENT PRIMARY KEY,
    nome varchar(100),
    email varchar(100) UNIQUE,
    crm varchar(6),
    especialidade varchar(100),
    logradouro varchar(100),
    bairro varchar(100),
    cep varchar(9),
    complemento varchar(100),
    numero varchar(20),
    uf char(2),
    cidade varchar(100),
    telefone varchar(20),
    ativos bit(1)
);

CREATE TABLE pacientes (
    id bigint AUTO_INCREMENT PRIMARY KEY,
    nome varchar(100),
    email varchar(100) UNIQUE,
    cpf varchar(14) UNIQUE,
    telefone varchar(20),
    logradouro varchar(100),
    bairro varchar(100),
    cep varchar(9),
    complemento varchar(100),
    numero varchar(20),
    uf char(2),
    cidade varchar(100)
);
