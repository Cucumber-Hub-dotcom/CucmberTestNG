Feature: Place an order

  Scenario: Using default payment option
    Given I'm a guest user
    And I have a product in the cart
    And I'm on the Checkout page
    When I provide billing details
    |firstname|lastname|country|address_line1|city|state|zip  |email          |
    |Hari     |RK      |US     |8900 add     |Plo |Assam|89098|katih@gmail.com|
    And I place an order
    Then the order should be placed successfully