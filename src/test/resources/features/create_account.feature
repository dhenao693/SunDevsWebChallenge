  #language: en
  Feature: Create account


    Scenario Outline: Create account successfull
      Given "Daniel" is on cinemark page
      When he registers in the app
        | name   | lastName   | personType   | email   | phone   | address   | gender   | birthdate   | documentType   | documentNumber   | city   | preferredTheater   | password   |
        | <name> | <lastName> | <personType> | <email> | <phone> | <address> | <gender> | <birthdate> | <documentType> | <documentNumber> | <city> | <preferredTheater> | <password> |
      Then see register confirmation

      Examples:
        | name   | lastName | personType | email                | phone      | address            | gender    | birthdate  | documentType         | documentNumber | city   | preferredTheater | password   |
        | Daniel | Henao    | Natural    | dhenao16@yopmail.com | 3181237535 | Calle siempre viva | Masculino | 1994-12-16 | Cédula de ciudadanía | 1345678912     | Bogota | Lab v5 Floresta  | Prueba1234 |
        #| Zeli   | Rua      | Jurídica   | zeli@yopmail.com   | 3011234567 | Calle siempre viva 2 | Femenino  | 1999-12-10 | Cédula de Extranjería | 2223456789     | Bogota | Lab v5 Multiplaza | Prueba1234   |