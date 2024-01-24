  #language: en
  Feature: Create account


    Scenario Outline: Create account successfull
      Given "Daniel" is on cinemark page
      When he registers in the app
        | name   | lastName   | personType   | email   | phone   | address   | gender   | birthdate   | documentType   | documentNumber   | city   | preferredTheater   | password   |
        | <name> | <lastName> | <personType> | <email> | <phone> | <address> | <gender> | <birthdate> | <documentType> | <documentNumber> | <city> | <preferredTheater> | <password> |
      Then see register confirmation

      Examples:
        | name   | lastName | personType | email              | phone      | address            | gender    | birthdate  | documentType         | documentNumber | city   | preferredTheater | password |
        | Daniel | Henao    | Natural    | dhenao@yopmail.com | 3181234567 | Calle siempre viva | Masculino | 16/12/1994 | Cédula de Ciudadanía | 123456789      | Bogota | Lab v5 Floresta  | 123456   |
        #| Zeli   | Rua      | Jurídica   | zeli@yopmail.com   | 3011234567 | Calle siempre viva 2 | Femenino  | 10/12/1999 | Cédula de Extranjería | 2223456789     | Bogota | Lab v5 Multiplaza | 123456   |