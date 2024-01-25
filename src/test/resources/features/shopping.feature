  #language: en
  Feature: Login


    Scenario Outline: Login successfull
      Given "Daniel" is on cinemark page
      When he login in app
        | name   | lastName   | personType   | email   | phone   | address   | gender   | birthdate   | documentType   | documentNumber   | city   | preferredTheater   | password   |
        | <name> | <lastName> | <personType> | <email> | <phone> | <address> | <gender> | <birthdate> | <documentType> | <documentNumber> | <city> | <preferredTheater> | <password> |
      And he buys some seats to the movie
      Then see the correct email

      Examples:
        | name    | lastName | personType | email                    | phone      | address | gender    | birthdate  | documentType         | documentNumber | city   | preferredTheater | password  |
        | usuario | login    | Natural    | usuariologin@yopmail.com | 3189876543 | prueba  | Masculino | 16/12/1994 | Cédula de Ciudadanía | 987654321      | Bogota | Lab v5 Floresta  | Prueba123 |