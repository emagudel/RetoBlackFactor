Feature: Search the BlackFactor page for the Blogs published by the authors
  I want to search the Blog for an article with updated and new content


  Scenario Outline: Search the Blog for an article by Sofia Gonzalez related to the topic ¨Why Fintech in Latin America Is Having a Boom¨
    Given I visit the page Blankfactor
    When I search in the Blog an article with this information
      | ID   | topic   | written_by   | expectedResult   |
      | <ID> | <topic> | <written_by> | <expectedResult> |
    Then I see the availability of the cruises

    Examples:
      | ID | topic                                         | written_by     | expectedResult               |
      | 1  | Why Fintech in Latin America Is Having a Boom | Sofia Gonzalez | The World of Payment Systems |
