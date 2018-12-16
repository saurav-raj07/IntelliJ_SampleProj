Feature: testing of the Get mthod

  Scenario: Verification of the scenario when a user submits the GET request

    When user user passed a GET request
    Then Status code is 200
