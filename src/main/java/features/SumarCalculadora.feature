
@SmokeTest
Feature: Sumar


  Scenario: Sumar dos numeros
    Given Me encuentro en la pagina principal
    When ingreso dos numeros
      | 5 | 2 | 1 |

    And Selecciono la operacion
      | Add |
    Then Debe arrojar el resultado correcto

