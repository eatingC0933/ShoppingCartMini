package se.yitingchang;

public class ItemTest {
}
package se.yitingchang;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testGetName() {
        Item item = new Item("Omega3", 125);
        assertEquals("Omega3", item.getName());
    }

    @Test
    public void testGetPrice() {
        Item item = new Item("Omega3", 125);
        assertEquals(125, item.getPrice());
    }


}