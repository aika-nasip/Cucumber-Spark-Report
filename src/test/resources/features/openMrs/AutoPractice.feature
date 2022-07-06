Feature: CUSTOMER SERVICE - CONTACT US
  Scenario Outline: Validate Contact Us Functionality
    Given user is on contact us page
    When user fills the form with given sheet name "contact" and row number <rowNumber>
    And user clicks on send button
    Then user validates success message "Your message has been successfully sent to our team."
    Examples:
    |rowNumber|
    |1        |
    |2        |
    |3        |
    |4        |