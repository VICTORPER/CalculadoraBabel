
@SmokeTest
Feature: Restar numeros


  Scenario: Se validar que se resten dos numeros
    Given Me encuentro en la pagina principal de la calculadora
    When ingreso dos numeros
      | 5 | 2 | 5 |

    And Selecciono la operacion
      | Subtract |

    And doy click en el boton calcular

    Then Debe arrojar el resultado correcto de la resta de los dos numeros

