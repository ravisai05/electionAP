Feature: 
  Display Constincy canditate and majority of AP assembly elections

  Scenario: Get all the canditate magiority
    Given User is on AP Election Page
    When Click on TDP Page
    And Click on JSP page
    And Click on YSRCP page
    And click on BJP Page
    Then Verify total number of details of canditates displayed
