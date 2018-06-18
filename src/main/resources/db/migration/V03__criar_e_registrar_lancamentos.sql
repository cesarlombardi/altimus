create table lancamento(
	codigo int(10) primary key auto_increment,
	descricao varchar(50) not null,
	data_vencimento date not null,
	data_pagamento date,
	valor decimal(10,2) not null,
	observacao varchar(255),
	tipo varchar(7) not null,
	codigo_categoria int(10) not null,
	codigo_pessoa int(10) not null,
	foreign key (codigo_categoria) references categoria(codigo),
	foreign key (codigo_pessoa) references pessoa(codigo)
) engine=innodb default charset=utf8;

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Teste', '2018-01-05', null, 2000, null, 'RECEITA', 5, 1 );