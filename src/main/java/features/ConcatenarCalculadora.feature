
@SmokeTest
Feature: Concatenar dos numeros


  Scenario:  Validar que se concatenen dos numeros
    Given Me encuentro en la pagina principal de la calculadora
    When ingreso dos numeros
      | 12 | Victor |  4 |

    And Selecciono la operacion
      | Concatenate |

    And doy click en el boton calcular

    Then Debe arrojar el resultado correcto de la resta de los dos numeros

