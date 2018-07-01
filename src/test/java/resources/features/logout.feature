@SmokeTest
Feature: As a user of ParentPay Application,after i login to the application,i want to be able to logout

  Scenario:
    Given I successfully login to PPay
    When I click on the logout button
    Then I am able to logout successfully
