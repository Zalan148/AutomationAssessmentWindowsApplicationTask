Feature: File
  As a user of notepad,
  I want to be able to select options from a File menu,
  So that I can handle files

  @zalantest
  Scenario: Open dialog
    Given notepad is launched
    When I click File
    And I select Open from the menu options
    Then Open dialog is displayed

  @zalantest
  Scenario: New tab
    Given notepad is launched
    When I click File
    And I select New tab from the menu options
    Then a new tab is opened
