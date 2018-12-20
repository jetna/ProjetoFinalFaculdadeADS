create table modelo(
id int primary key auto_increment,
modelo varchar(15),
marcaId int,
corId int,
foreign key (marcaId) references marca(id),
foreign key (corId) references cor(id)

 );
alter  table modelo drop foreign key fk_cor;
alter  table modelo drop foreign key fk_preco;

ALTER TABLE modelo ADD precoId int NOT NULL;
ALTER TABLE modelo ADD CONSTRAINT fk_cor FOREIGN KEY (corId) REFERENCES cor(id);

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
→ corId
cor 
→ id
→ nome
→ quantidade
→ modeloId



*/
alter table modelo add corId varchar(15) not null;
alter table modelo add constraint foreign key (corId) references cor(id);