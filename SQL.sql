create database db_Gerenciador_de_Estoque
go

use db_Gerenciador_de_Estoque

go
create table Enderecos(
	IDEndereco int IDENTITY(1,1) primary key not null,
	Pais varchar(50) not null,
	Estado varchar(50) not null,
	Cidade varchar(50) not null,
	Bairro varchar(50) not null,
	Rua varchar(50) not null,
	Numero varchar(10) not null
);

create table Contatos(
	IDContato int IDENTITY(1,1) primary key not null,
	Telefone1 varchar(22) not null,
	Telefone2 varchar(22) null,
	Email1 varchar(50) null,
	Email2 varchar(50) null,
);

create table Fornecedores(
	IDFornecedor int IDENTITY(1,1) primary key not null,
	IDEndereco int not null,
	IDContato int not null,
	CNPJ varchar(14) not null,
	RazaoSocial varchar(50) not null,
	NomeFantasia varchar(50) not null,

	CONSTRAINT fkEndereco FOREIGN KEY (IDEndereco) REFERENCES Enderecos (IDEndereco),
	CONSTRAINT fkContato FOREIGN KEY (IDContato) REFERENCES Contatos (IDContato)
);

create table Clientes(
	IDCliente int IDENTITY(1,1) primary key not null,
	IDEndereco int not null,
	IDContato int not null,
	CPF varchar(11) not null,
	Nome varchar(70) not null,
	DataDeNascimento date not null,

	CONSTRAINT fkEndereco2 FOREIGN KEY (IDEndereco) REFERENCES Enderecos (IDEndereco),
	CONSTRAINT fkContato2 FOREIGN KEY (IDContato) REFERENCES Contatos (IDContato)
);

create table Compras(
	IDCompra int IDENTITY(1,1) primary key not null,
	IDFornecedor int not null,
	DataHoraDaCompra datetime not null,
	ValorTotal float not null,

	CONSTRAINT fkFornecedor FOREIGN KEY (IDFornecedor) REFERENCES Fornecedores (IDFornecedor)
);

create table Produtos(
	IDProduto int IDENTITY(1,1) primary key not null,
	Nome varchar(70) not null,
	Marca varchar(70) not null,
	Medida varchar(70) not null,
	ValorVenda float not null,
	Quantidade int not null,
	Ativo bit not null,
	Descricao varchar(150) null,

);

create table ItensComprados(
	IDItemComprado int IDENTITY(1,1) primary key not null,
	IDCompra int not null,
	IDProduto int not null,
	Quantidade int not null,
	ValorUnitario float not null,

	CONSTRAINT fkCompra FOREIGN KEY (IDCompra) REFERENCES Compras (IDCompra),
	CONSTRAINT fkProduto FOREIGN KEY (IDProduto) REFERENCES Produtos (IDProduto)
);

create table Vendas(
	IDVenda int IDENTITY(1,1) primary key not null,
	IDCliente int not null,
	DataHoraDaVenda datetime not null,
	ValorTotal float not null,
	FormaDePagamento varchar(50) not null,

	CONSTRAINT fkCliente FOREIGN KEY (IDCliente) REFERENCES Clientes (IDCliente)
);

create table ItensVendidos(
	IDItemVendido int IDENTITY(1,1) primary key not null,
	IDVenda int not null,
	IDProduto int not null,
	Quantidade int not null,
	ValorUnitario float not null,

	CONSTRAINT fkVenda FOREIGN KEY (IDVenda) REFERENCES Vendas (IDVenda),
	CONSTRAINT fkProduto2 FOREIGN KEY (IDProduto) REFERENCES Produtos (IDProduto)
);


------------------------ anonimos -----------------------------------

insert into Enderecos(Pais, Estado, Cidade, Bairro, Rua, Numero) values ('Fornecedor Anônimo', 'xxxx', 'xxxx', 'xxxx', 'xxxx', '0000');

insert into Contatos(Telefone1, Telefone2, Email1, Email2) values ('+00 (00) 0 0000-0000', '+00 (00) 0 0000-0000', 'Fornecedor_Anonimo@gmail.com.br', 'xxxxxxxx@gmail.com.br');

insert into Fornecedores(IDEndereco, IDContato, CNPJ, RazaoSocial, NomeFantasia) values (1, 1, '00000000000000', 'Fornecedor Anônimo', 'xxxxxxxx');

insert into Clientes( IDEndereco, IDContato, CPF, Nome, DataDeNascimento) values (1, 1, '00000000000', 'Cliente Anônimo', '2000-01-01');

