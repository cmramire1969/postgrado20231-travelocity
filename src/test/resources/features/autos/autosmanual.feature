# language: es
Característica: Autos
  @Manual
  @Manual:Passed
  Escenario: Buscar un auto tipo Van con origen y destino de entrega
    Cuando "Carlos M" busca un auto en arriendo en "Miami" para entregar en "Orlando"
    Entonces se debe encontrar al menos una opcion con valor menor a 50