@Search-cars
Feature: Acceptence testing to validate search page is working or not
  In order to validate that
  search car page is working fine
  we will do accepence testing

  @Search-car-positive
  Scenario: Validate the search page
    Given I am on the home page "https://www.carsguide.com.au/" of cars
    When I move to the menu
      | Menu     |
      | buy+Sell |
      | reviews  |
    And click on "Search cars" link
    And select carbrand as "BMW" from Anymake dropdown
    And select carmodel as "1 Series" from select model dropdown
    And select location as "ACT - All" from select location dropdown
    And select price as "$1,000" from price dropdown
    And click on Find my next car button
    Then I should see the list of searched cars
    And page title should be "Bmw 1 Series Under 1000 for Sale ACT | carsguide"
