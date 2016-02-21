Feature: Amazon search function

  Scenario Outline: User can search any items from amazon
    Given User go to amazon <url>
    When User input items <query> to search
    Then User get <query> from result

    Examples:
    |url|query|
    |www.amazon.com|books|

