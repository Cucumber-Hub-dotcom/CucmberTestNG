Feature:Add to cart

  @scenario1
    Scenario Outline:Add one quantity to the cart 1
    Given I am on the same store
    When  I add a product "<product_Name>" to the cart
    Then  I see 1 "<product_Name>" in the cart
    Examples:
      | product_Name |
      |Blue shoes     |