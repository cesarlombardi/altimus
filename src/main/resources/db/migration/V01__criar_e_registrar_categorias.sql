create table categoria(
	codigo int(10) primary key auto_increment,
	nome varchar(50) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into categoria(nome) values ('Lazer');
insert into categoria(nome) values ('Alimentação');
insert into categoria(nome) values ('Supermercado');
insert into categoria(nome) values ('Farmácia');
insert into categoria(nome) values ('Outros');