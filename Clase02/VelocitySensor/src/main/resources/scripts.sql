use multas;

create table Ticket
(
    idTicket                 int primary key,
    fechaYhora               long,
    patente                  varchar(10),
    tipoVehiculo             varchar(50),
    situacionClimatologica   varchar(100),
    limiteVelocidadPermitido int,
    limiteMedido             int
)

select * from Ticket