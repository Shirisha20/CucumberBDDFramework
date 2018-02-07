Feature: Facebook Login Feature
  
  
  without Examples Keyword

  Scenario: FaceBook Login Test Scenario
    #Given user is already on Login Page
    When title of login page is Facebook - Log In or Sign Up
    Then user enters "EmailId" and "Pwd"
    Then user is on home page
    When user click on Traingle button
    And click on Logout button
    Then user is on Login Page
