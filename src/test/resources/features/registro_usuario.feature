Feature: verificar la tarifa de los clientes

  @Registro
  Scenario Outline: Registro exitoso
  Given Yo ingreso a la pagina de compras
   When Yo ingreso a la creacion de cuentas con los datos <usuario> <correo> <contraseña>
    Then yo valido mensaje registro <usuario>
    Examples:
      |   usuario  |   correo  |    contraseña       |
      |	 Juanc126   |Juanc126@gmail.com    |Juanc117|
  @Ingreso
  Scenario Outline: Ingreso exitoso
    Given Yo ingreso a la pagina de compras
    When yo ingreso a la cuenta con los datos <usuario> <contraseña>
    Then yo valido mensaje registro <usuario>
    Examples:
      |   usuario    |    contraseña       |
      |	 Juanc124     |Juanc112|


  @Contactenos
  Scenario Outline: Contactenos
    Given Yo ingreso a la pagina de compras
    When yo registro contactenos con el <articulo> la <marca> el <correo> y <infor>
    Then yo valido mensaje contactenos
    Examples:
      | articulo | marca|correo|infor|
      |Laptops   | HP Chromebook 14 G1(ES)| juan123@gmail.com  | laptop nueva   |


  @Carrito
  Scenario Outline: Seleccion de producto de la seccion speaker
    Given Yo ingreso a la pagina de compras
    When yo selecciono y agrego un producto <speaker>
    Then yo valido mensaje en carrito <speaker>
    Examples:
      |   speaker    |
      |Bose Soundlink Bluetooth Speaker III|