Feature: verificar la tarifa de los clientes

  @exitosos
  Scenario Outline: buscar tarifa mas economica en los diferentes destinos y verificar
                    que el precio total sea correcto
  Given Yo ingreso a la pagina de viajes
   When Yo selecciono la ciudad <location> en el dia <checkIn> hasta <checkOut>
    And yo selecciono precio mas economico
    Then yo valido precio total <checkIn> con <checkOut>
    Examples:
      |   location  |   checkIn  |    checkOut       |
      |	 Los Angeles   |03/20/2021    |03/21/2021|
      |	 San Francisco   |03/22/2021   |03/24/2021|