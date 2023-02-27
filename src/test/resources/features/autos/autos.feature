# language: es
Característica: Autos

  Escenario: Buscar un auto con origen y destino de entrega
    Cuando "Carlos M" busca un auto en arriendo en "Medellin" para entregar en "Cartagena"
    Entonces se debe encontrar al menos una opcion con valor menor a 50