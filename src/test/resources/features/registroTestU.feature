# Autor: Jorge Vargas
@stories
Feature: UTest
  I want to automate registration process on the UTest website
  @scenario1
  Scenario: Complete the registration process on the UTest website
    Given Jorge wants to learn automation
      | firstName | lastName | email |  birthMonth | birthday | birthYear | language | city | postalCode| country| device | model | system | password | confirmPassword |
      | Jorge    | Vargas   | jorgee.vargasc@utadeo.edu.co | January | 30 | 1998 | Spanish | Anapoima | 252640  | Colombia | Xiaomi | Redmi Note 8 Pro | Android 10| Passtest123* | Passtest123* |

    When Registration is successful

    Then Browse uTest