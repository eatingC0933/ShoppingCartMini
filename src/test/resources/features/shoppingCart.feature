Feature:
  As a pharmacy customer
  I want to add and remove items from the shopping cart
  So that I can see the total price after calculating updated

  Scenario: Add an item to shopping cart
    Given an empty shopping cart
    When I add 1 item "Omega3" with a price of 125
    Then the total price updates to 125

  Scenario: Remove item from shopping cart
    Given a shopping cart contains 1 "Omega3" (125) and 1 "Vitamin D" (80)
    When I remove 1 item "Omega3"
    Then the total price updates to 80