Feature: WORKFLOW:Sheet1 - API Contract validation status
    Scenario: Load initial set of data
      Given Provided all the feature level parameters from file
    @api
    Scenario:  - GET api call
      Given a user perform a api action
      And add request with given header params
        | contentType                   | application/json                         |
      When a user get application/json in /api/unknown/2 resource on api
      Then Verify the status code is 200
      And Verify across response includes following in the response
        | data.year                 |  2001                          |
