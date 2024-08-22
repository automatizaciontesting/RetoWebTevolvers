Feature: Realizar el login en hotel DX Hotels
  Como usuario quiero realiza el logueo en DX Hotels


  @loginSinCaptchaDxHotels
  Scenario: Validar login sin diligenciar captcha
    Given como "prospecto huesped" quiero ingresar a la pagina DX Hotels
    When ingreso credenciales de acceso
      | email          | password |
      | juan@gmail.com | Prueba1  |
    Then valido mensaje excepcion captcha sin diligenciar


