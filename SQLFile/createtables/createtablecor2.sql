create table cor(
id int primary key auto_increment,
nome varchar(15),
modeloId int,
foreign key (modeloId) references modelo(id));

ALTER TABLE cor ADD modeloId int;
alter table cor drop foreign key fk_quantId;

ALTER TABLE cor ADD CONSTRAINT fk_modelo FOREIGN KEY (modeloId) REFERENCES modelo(id);
