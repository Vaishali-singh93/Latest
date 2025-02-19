Feature: Facebook login
  Scenario Outline: login
    Given Facebook login site
    When I fill <username> and <password>
    And Click on login
    Then I Successfully Login
    Examples:
      | username |password|
      | "bhadouria1708@gmail.com" |"Amita@1708"|
      | "vaishali.singh1708@gmail.com" |"amita@1708"|
