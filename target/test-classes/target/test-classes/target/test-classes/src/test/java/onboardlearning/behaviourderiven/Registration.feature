Feature: New User Registration in online shopping portal

  Scenario Outline: New User registration on shopping portal
    Given Navigate to online site link <url>
    When user provides firtsName as "<firstname>"
    And user provides lastname as "<lastname>"
    And user must provides active email as <emailaddress>
    And user must provide password as <password>
    And click on Register button

    Examples:
      |firstname|lastname| emailaddress                   | password     |url|
      |vaishali |singh   | "bhadouria1708@gmail.com"      | "Amita@1708" | "https://my.gumtree.com/create-account"|



  Scenario Outline: user login on online portal
    Given Navigate to online site link <url>
    When user must provide registered email as <emailaddress>
    And user must provide created password as <password>
    And click on Login button


    Examples:
      | emailaddress                   | password     |url|
      | "bhadouria1708@gmail.com"      | "Amita@1708" |"https://my.gumtree.com/login"|

