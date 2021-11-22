
@SmokeTest
Feature: Sumar


  Scenario: Validar mensaje de error
    Given Me encuentro en la pagina principal
    When ingresa letras en los campos
      | A | B | 0 |

    And Selecciono la operacion
      | Add |
    Then Deberia ver el texto Number 1 is not a number


