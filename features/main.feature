
@tag
Feature: vaildating the demoqa websites
 

  @tag1
  Scenario: Checking TextBoxes
 
    Given User is in Register page
 
    When User enter the firstname and lastname | fName | lName |  | Bala  | Sri   |   | Prem  | Sir   |
 
    Then  The user validate the entered firstname and lastname
    
   

