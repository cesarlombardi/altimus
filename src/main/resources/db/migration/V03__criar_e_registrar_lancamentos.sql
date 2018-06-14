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
values ('Salário', '2018-01-05', null, 2000, null, 'RECEITA', 5, 1 );

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Salário', '2018-01-05', null, 3000, null, 'RECEITA', 5, 3 );

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Café', '2018-01-12', null, 5, null, 'DESPESA', 10, 4 );

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Salário', '2018-01-05', null, 1200, null, 'RECEITA', 5, 2 );

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Cinema', '2018-01-08', null, 18, null, 'DESPESA', 1, 3 );

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Almoço', '2018-01-05', null, 25, null, 'DESPESA', 2, 2 );

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Roupas', '2018-01-07', null, 150, null, 'DESPESA', 5, 1 );

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Mercado', '2018-01-07', null, 200, null, 'DESPESA', 3, 5 );

insert into lancamento(descricao, data_vencimento, data_pagamento, valor, observacao, tipo, codigo_categoria, codigo_pessoa) 
values ('Medicamento', '2018-01-15', null, 12, null, 'DESPESA', 4, 7 );
 