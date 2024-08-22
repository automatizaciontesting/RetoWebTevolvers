Feature: Realizar la reserva en hotel DX Hotels
  Como usuario quiero realiza la programación en la plataforma de avianca


  @reservarHotel
  Scenario: Realizar reserva de hotel
    Given como "prospecto huesped" quiero ingresar a la pagina DX Hotels
    When ingreso datos de reserva hotel
      | destino   | habitaciones | adultos | menores |
      | Las Vegas | 2            | 3       | 2       |
    And rango superior a "$220USD"
    And seleccionar 3 estrellas o mas
    And seleccionar filtro
    Then valido el hotel mas economico
