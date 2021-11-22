
@SmokeTest
Feature: Dividr un numero entre cero


  Scenario:  Validar que al dividir un numero sobre cero de Error
    Given Me encuentro en la pagina principal de la calculadora
    When ingreso dos numeros
      | 4 | 0 |  4 |

    And Selecciono la operacion
      | Divide |

    And doy click en el boton calcular

    Then Debe arrojar el resultado correcto de la resta de los dos numeros

