@SmokeTest
Feature: As a user of ParentPay Application, I want to be able to make payments for my son's school meals

  Scenario:
    Given I login successfully to PPay
    When I click on pay for meal
    And I enter the amount i would like to pay
    And I click on add to basket
    And I click on view basket and pay
    And I click on other payment method
    Then The secure checkout page should be displayed