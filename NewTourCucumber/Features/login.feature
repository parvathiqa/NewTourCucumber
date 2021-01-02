Feature: http://newtours.demoaut.com/mercuryregister.php
Scenario: register http://newtours.demoaut.com/
    Given user is on http://newtours.demoaut.com/mercuryregister.php
    And click the signon link 
    When user enter the firstname
    And user enter the lastname
    And user enter the phone number
    And user enter the email
    And user enter the address
    And user enter the city
    And user enter the state and province
    And user enter the postal code
    And user select the country
    When user enter the username 
    And user enter the password
    And user enter the conforim password  
    Then click the register button
    And close the application