@Used-Search-cars
Feature: Acceptence testing to validate Used search page is working or not
  In order to validate that
  used search car page is working fine
  we will do accepence testing

  @Used-Search-car-positive
  Scenario: Validate the search page
    Given I am on the home page "https://www.carsguide.com.au/" of cars
    When I move to the menu
      | Menu     |
      | buy+Sell |
      | reviews  |
    And click on "Used" link on Used search car page
    And select carbrand as "Audi" from Anymake dropdown on Used search car page
    And select carmodel as on Used search car page
			| Model    |
			| A4       |	
			| A3       |
    And select location as "WA - All" from select location dropdown on Used search car page
    And select price as "$1,000" from price dropdown on Used search car page
    And click on Find my next car button on Used search car page
    Then I should see the list of searched cars on Used search car page
    And page title should be "Used Audi A4 Under 1000 for Sale WA | carsguide"