package se.yitingchang.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import se.yitingchang.Item;
import se.yitingchang.ShoppingCartMini;

public class ShoppingCartMiniSteps {
    private ShoppingCartMini cart;

    @Given("an empty shopping cart")
    public void emptyShoppingCart() {
        cart = new ShoppingCartMini();
    }

    @When("I add {int} item {string} with a price of {int}")
    public void addItemWithAPrice(int quantity, String itemName, int price) {
        cart.addItem(new Item(itemName, price), quantity);
    }

    @Then("the total price updates to {int}")
    public void totalPriceUpdates(int expectedTotal) {
        assertEquals(expectedTotal, cart.getTotalPrice());
    }



    @Given("a shopping cart contains 1 {string} \\({int}) and 1 {string} \\({int})")
    public void shoppingCartContains(String itemName1, int price1, String itemName2, int price2) {
        cart = new ShoppingCartMini();
        cart.addItem(new Item(itemName1, price1),1);
        cart.addItem(new Item(itemName2, price2),1);
    }

    @When("I remove {int} item {string}")
    public void removeItem(int quantity, String itemName) {
        cart.removeItem(itemName, quantity);
    }



}