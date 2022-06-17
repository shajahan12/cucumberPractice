Feature: Opening pages and display names

Scenario Outline: Open webpage and show page names
    Given Open <pagename> webpage
    When webpage testing jenkins
    Then display <pagevalue> webpage names

    Examples: 
      | pagename  | pagevalue |
      | amazon.com |     amazon |
      | walmart.com |   walmart   |
