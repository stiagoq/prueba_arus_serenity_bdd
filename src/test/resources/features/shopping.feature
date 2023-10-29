Feature: Filter and add products to shopping car

  @prueba1
  Scenario: Filter of products by category
    Given User is in the home page
    When User selects the product category.
    Then The page shows the product's list

  @prueba2
  Scenario: Add products to shopping car
    Given User is in the product's list
    When User selected the products
    Then The shopping cart shows the product's names
    Then The shopping cart shows the quantity by each product
    Then The shopping cart shows the total price


