Feature: Facebook Signup

  Scenario: Facebook Create a new Account scenario
    # Given user is  on Home Page
    When title of Home page is Facebook - Log In or Sign Up
    Then user enters Signup Credentials to Sign Up
      | FName | LName | EmailId       | ReEmail       | Pwd     |
      | abc   | abcd  | abc@gmail.com | abc@gmail.com | test123 |
      | cba   | cba   | cba@gmail.com | cba@gmail.com | test123 |
#Then Close the browser
