Feature: Opening pages and display names

Scenario Outline: Open webpage and show page names
    Given Open <pagename> webpage
    Then display <pagevalue> webpage names

    Examples: 
      | pagename  | pagevalue |
      | amazon.com |     amazon |
      | walmart.com |   walmart   |
