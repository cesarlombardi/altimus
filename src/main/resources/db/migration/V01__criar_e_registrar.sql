create table modelo(
	id int(10) primary key auto_increment,
	modelo varchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table opcional(
	id int(10) primary key auto_increment,
	opcional varchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table carro(
	id int(10) primary key auto_increment,
	dt_cadastro datetime,
	placa varchar(7),
	renavam varchar(11),
	modelo int(10),
	valor decimal(10,2),
	CONSTRAINT fk_modelo_id FOREIGN KEY (modelo) REFERENCES modelo (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table opcional_carro(
	id int(10) primary key auto_increment,
	carro_id int(10),
	opcional_id int(10),
	CONSTRAINT fk_carro_id FOREIGN KEY (carro_id) REFERENCES carro (id),
	CONSTRAINT fk_opcional_id FOREIGN KEY (opcional_id) REFERENCES opcional (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into modelo (modelo) values ('celta');
INSERT INTO modelo (modelo) VALUES ('corsa');
INSERT INTO modelo (modelo) VALUES ('gol');
INSERT INTO modelo (modelo) VALUES ('palio');
INSERT INTO modelo (modelo) VALUES ('uno');
insert into opcional (opcional) values ('ar');
insert into opcional (opcional) values ('direção');
insert into opcional (opcional) values ('abs');