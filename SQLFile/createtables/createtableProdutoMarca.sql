create table produto(
id int primary key auto_increment,
nome varchar(15)
);
create table marca(
id int primary key auto_increment,
marca varchar(15),
produtoId int,
foreign key (produtoId) references produto(id));
create table cor(
id int primary key auto_increment,
nome varchar(15),
quantidade int,
modeloId int,
foreign key (modeloId) references modelo (id));

create table preco(
id int primary key auto_increment,
valora float,
valorr float,
corId int,
foreign key (corId) references cor(id));

/* ---- anotacoes -------- */
/*
Galaxy S5
Galaxy S4
Galaxy S3
Galaxy Y
C3313
iPhone 5s
Lumia 520
iPhone 5s

Modelo
→ id
→ modelo
→ marcaId

cor 
→ id
→ nome
→ quantidade
→ modeloId*/



