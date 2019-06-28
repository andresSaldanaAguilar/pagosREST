drop database pagos;
create database pagos;
use pagos;

create table usuario(
    idUsuario int not null primary key auto_increment,
    correo varchar(30),
    contraseña varchar(30)
);

create table usuarioPago(
    idUsuarioPago int not null primary key auto_increment,
    idUsuario int not null,
    foreign key (idUsuario) references usuario(idUsuario)
);

create table pago(
    idPago int not null primary key auto_increment,
    idUsuarioPago int not null,
    descripcion varchar(30),
    monto int,
    foreign key (idUsuarioPago) references usuarioPago(idUsuarioPago)
);

insert into usuario(correo,contraseña) values ('usuario1@gmail.com','123');
insert into usuarioPago(idUsuario) values (1);
insert into pago(idUsuarioPago, descripcion, monto) values (1,'Predial',531);