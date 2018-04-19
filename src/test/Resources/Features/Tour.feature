@henk

Feature: book tour

  i want to search for a tour

  Scenario: I want to book a tour
    Given I am on the homepage
    And I click on tours
    When I select the first result on the page
    And click on book now
    Then I get directed to the booking form