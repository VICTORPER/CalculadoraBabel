
@SmokeTest
Feature: Dividir dos numeros


  Scenario: Se valida que se dividan dos numeros
    Given Me encuentro en la pagina principal de la calculadora
    When ingreso dos numeros
      | 5 | 2 |  8 |

    And Selecciono la operacion
      | Divide |

    And doy click en el boton calcular

    Then Debe arrojar el resultado correcto de la resta de los dos numeros

