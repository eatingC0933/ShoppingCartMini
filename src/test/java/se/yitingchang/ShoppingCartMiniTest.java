package se.yitingchang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ShoppingCartMiniTest {

    private ShoppingCartMini cart;
    private Item omega3;
    private Item vitaminD;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCartMini();
        omega3 = new Item("Omega3", 125);
        vitaminD = new Item("Vitamin D", 80);
    }

    @Test
    public void testAddItem() {
        cart.addItem(omega3, 1);
        List<Item> items = cart.getItems();
        assertEquals(1, items.size());
        assertEquals(omega3, items.get(0));
    }

    @Test
    public void testRemoveItem() {
        cart.addItem(omega3, 1);
        cart.addItem(vitaminD, 1);
        cart.removeItem("Omega3", 1);
        List<Item> items = cart.getItems();
        assertEquals(1, items.size());
        assertEquals(vitaminD, items.get(0));
    }

    @Test
    public void testGetTotalPrice() {
        cart.addItem(omega3, 1);
        cart.addItem(vitaminD, 1);
        assertEquals(205, cart.getTotalPrice());
    }

    @Test
    public void testRemoveNonExistentItem() {
        cart.addItem(vitaminD, 1);
        cart.removeItem("Omega3", 1);
        List<Item> items = cart.getItems();
        assertEquals(1, items.size());
        assertEquals(vitaminD, items.get(0));
    }

    @Test
    public void testAddMultipleItems() {
        cart.addItem(omega3, 2);
        cart.addItem(vitaminD, 3);
        List<Item> items = cart.getItems();
        assertEquals(5, items.size());
        assertEquals(omega3, items.get(0));
        assertEquals(omega3, items.get(1));
        assertEquals(vitaminD, items.get(2));
        assertEquals(vitaminD, items.get(3));
        assertEquals(vitaminD, items.get(4));
    }
}
