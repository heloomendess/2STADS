CREATE DATABASE loja_steam;
USE loja_steam;

show databases;

DROP TABLE acao;

/* criação de comentário */
# comentário de uma linha 

CREATE TABLE acao (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);	

DROP TABLE aventura;

CREATE TABLE aventura (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE casuais;

CREATE TABLE casuais (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE rpg;

CREATE TABLE rpg (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE simulacao;

CREATE TABLE simulacao (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE estrategia;

CREATE TABLE estrategia (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE tabuleiro_e_cartas;

CREATE TABLE tabuleiro_e_cartas (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE esporte;

CREATE TABLE esporte (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE terror;

CREATE TABLE terror (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE idie;

CREATE TABLE indie (
	id_jogo int unsigned not null auto_increment,
    nome_jogo varchar(200) not null,
    data_lancamento datetime,
    desenvolvedora varchar(200),
    preco decimal(20,2),
    analise text, 
    distribuidora varchar(200),
    idioma text, 
    classificacao varchar(200),
    crossplay boolean,
    armazenamento varchar(200),
    PRIMARY KEY(id_jogo)
);

DROP TABLE id;

CREATE TABLE id (
	id int unsigned not null auto_increment,
    nome varchar(200) not null,
    PRIMARY KEY(id)
);

SELECT * FROM acao;
SELECT id_jogo, nome FROM acao;

/*EX: Criar somente as tabelas do lado 1 da cardinalidade do modelo de voces!!
Somente as tabelas que só tem chave primaria */