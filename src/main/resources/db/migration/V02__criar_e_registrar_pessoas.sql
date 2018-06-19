CREATE TABLE pessoa(
	codigo INT(10) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	ativo BOOLEAN NOT NULL,
	
	logradouro VARCHAR(50),
	numero VARCHAR(6),
	bairro VARCHAR(50),
	complemento VARCHAR(50),
	cep VARCHAR(9),
	cidade VARCHAR(50),
	estado VARCHAR(2)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO pessoa	(nome, logradouro, numero, bairro, complemento, cep, cidade, estado, ativo) 
			VALUES 	('Tiago', 'Araranguá', '14', 'Garcia', '', '89020-301', 'Blumenau', 'SC', TRUE);
INSERT INTO pessoa	(nome, logradouro, numero, bairro, complemento, cep, cidade, estado, ativo) 
			VALUES 	('Antonia', 'Amazonas', '20', 'Garcia', '', '89020-300', 'Blumenau', 'SC', TRUE);

