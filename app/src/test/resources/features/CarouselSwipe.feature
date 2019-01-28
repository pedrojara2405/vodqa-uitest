@e2e
Feature: Carousel Swipe

  Description: The purpose of this feature is to swipe twice the number box from Carousel Swipe activity

  Scenario: Carousel swipe from right to left twice
    Given VodQA app on android device is run
    Then load Login activity
    When I fill user name with "admin"
    When I fill password with "admin"
    When I push on "login" button
    Then load Sample List activity
    When I scroll down until find Carousel option
    When I push Carousel option
    Then load Carousel Swipe activity
    Then number box is equal to "1"
    When I swipe number box from right to left "2" times
    Then number box is equal to "3"