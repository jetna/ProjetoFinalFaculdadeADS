create table preco(
id int primary key auto_increment,
valorA float,
valorR float,
corid int,
foreign key (corid) references cor(id));

ALTER TABLE preco ADD modeloId int;
ALTER TABLE preco ADD CONSTRAINT fk_modeloToPreco FOREIGN KEY (modeloId) REFERENCES modelo(id);

ALTER TABLE quant CHANGE nome quant int;