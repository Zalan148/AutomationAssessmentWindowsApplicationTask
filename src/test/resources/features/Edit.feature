Feature: Edit
  As a user of notepad,
  I want to be able to select options from an Edit menu,
  So that I can Edit files

  @zalantest
  Scenario: Find search box
    Given notepad is launched
    And I enter three cities on separate lines
    When I click Edit
    And I select Find from the menu options
    And I perform a search for a city not entered
    Then a notice is displayed to say cannot find the city entered

  @zalantest
  Scenario: Time/Date
    Given notepad is launched
    When I click Edit
    And I select TimeDate from the menu options
    Then current Time and Date is displayed
