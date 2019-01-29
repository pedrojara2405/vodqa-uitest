@e2e
Feature: Carousel Swipe

  Description: The purpose of this feature is to swipe twice the number box from Carousel Swipe activity

  Scenario: Carousel swipe from right to left twice
    Given VodQA app is running on android device
    When I clear user name
    When I clear password
    When I type user name with "admin"
    When I type password with "admin"
    When I tap on log in button
    Then Samples List activity is loaded
    When I scroll down until find Carousel option
    When I tap on Carousel option
    Then Carousel Swipe is loaded
    Then number box is equal to "1"
    When I swipe number box from right to left "2" times
    Then number box is equal to "3"