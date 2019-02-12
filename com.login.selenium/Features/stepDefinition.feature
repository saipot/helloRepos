Feature: gmail Login test

  Scenario Outline: facebook_Login
    Given open Chrome Browser
    When  enter valid <"username"> and <"password">
    Then  login successful
    
  Examples:
  | username    | password  |
  |abc@gmail.com|password123|
  |cvf@gmail.com|password123|
