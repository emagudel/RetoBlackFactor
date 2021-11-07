Feature: Search the BlankFactor page for the Blogs published by the authors
  I want to search the Blog for an article with updated and new content


  Scenario Outline: Search the Blog for an article by Sofia Gonzalez related to the topic ¨Why Fintech in Latin America Is Having a Boom¨
    Given I visit the page Blankfactor
    When I search in the Blog an article with this information
      | ID   | topic   | written_by   | expectedResult   | currentUrl   |
      | <ID> | <topic> | <written_by> | <expectedResult> | <currentUrl> |
    Then I verify the information required for the successful case

    Examples:
      | ID | topic                                         | written_by     | expectedResult               | currentUrl                                        |
      | 1  | Why Fintech in Latin America Is Having a Boom | Sofia Gonzalez | The World of Payment Systems | https://blankfactor.com/fintech-in-latin-america/ |


  Scenario Outline: Search the Blog for an article by Alejandra Morales related to the topic ¨Three major takeaways from Money 20/20¨
    Given I visit the page Blankfactor
    When I search in the Blog an article with this information
      | ID   | topic   | written_by   | expectedResult   | currentUrl   |
      | <ID> | <topic> | <written_by> | <expectedResult> | <currentUrl> |
    Then I verify the information required for the successful case

    Examples:
      | ID | topic                                  | written_by        | expectedResult                | currentUrl                                    |
      | 2  | Three major takeaways from Money 20/20 | Alejandra Morales | Payments are eating the world | https://blankfactor.com/takeaways-money-2020/ |

  Scenario Outline: Search the Blog for an article by Alejandra Morales related to the topic ¨The Angular vs React vs Vue Debate: Which One Is Better?¨
    Given I visit the page Blankfactor
    When I search in the Blog an article with this information
      | ID   | email   | topic   | written_by   | expectedResult   | currentUrl   |
      | <ID> | <email> | <topic> | <written_by> | <expectedResult> | <currentUrl> |
    Then I verify the information required for the successful case
    And I Subscribe to our newsletter

    Examples:
      | ID | email                  | topic                                                    | written_by     | expectedResult                  | currentUrl                                       |
      | 3  | agudelo.0312@gmail.com | The Angular vs React vs Vue Debate: Which One Is Better? | Sofia Gonzalez | React: The Most Elemental Parts | https://blankfactor.com/angular-vs-react-vs-vue/ |


  Scenario Outline: Search the Blog for an article by Santi Salazar related to the topic ¨All You Need to Know About Flutter Development¨
    Given I visit the page Blankfactor
    When I search in the Blog an article with this information
      | ID   | topic   | written_by   | expectedResult   | currentUrl   |
      | <ID> | <topic> | <written_by> | <expectedResult> | <currentUrl> |
    Then I verify the information required for the alternate case

    Examples:
      | ID | topic                                          | written_by    | expectedResult | currentUrl |
      | 4  | All You Need to Know About Flutter Development | Santi Salazar |                |            |


  Scenario: Select the titles of all the publications
    Given I visit the page Blankfactor
    When I search in the Blog the articles