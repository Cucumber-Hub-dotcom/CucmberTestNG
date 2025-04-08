Feature: Add to cart

  Scenario: Navigate to store,add a product to the cart,click view cart link to navigate to the cart and verify
    Given I'm on the home page and navigate to the Store page by pressing "store" menu option
    When I click "Add to cart" button next to the product "Blue Shoes"
    Then the "Add to cart" button changes and a tick mark is shown on it
    Then "view cart" link is shown
    When I click on the "view cart" link
    Then I am navigated to the cart page
    When I fetch the product name and quantity
    Then the product name is "Blue Shoes"
    And the product quantity is 1


  Scenario: Add one item to cart
    Given I'm on the home page
    And  I navigate to the Store page by pressing "store" menu option
    When I click "Add to cart" button next to the product "Blue Shoes"
    Then the "Add to cart" button changes and a tick mark is shown on it
    Then "view cart" link is shown
    When I click on the "view cart" link
    Then I am navigated to the cart page
    When I fetch the product name and quantity
    Then the product name is "Blue Shoes"
    And the product quantity is 1

    Scenario Outline:
      Given I'm on the store page
      When I add a "<product>" to the cart
      Then I see <quantity> "<product>" in the cart
      Examples:
        |product   |quantity|
        |blue shoes|1       |