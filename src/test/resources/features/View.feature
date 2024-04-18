Feature: View
  As a user of notepad,
  I want to be able to select options from a View menu,
  So that I can view files the way I like

  @zalantest
  Scenario: Highlight option  - Negative scenario
    Given notepad is launched
    When I click View
    Then I can select Highlight from the menu options
