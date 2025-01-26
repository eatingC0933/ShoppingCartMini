package se.yitingchang;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartMini {
    private List<Item> items;

    public ShoppingCartMini() {
        items = new ArrayList<>();
    }

    public void addItem(Item item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            items.add(item);
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void removeItem(String itemName, int quantity) {
        for (int i = 0; i < quantity; i++) {
            items.removeIf(item -> item.getName().equals(itemName));
        }
    }

    public int getTotalPrice() {
        return items.stream().mapToInt(Item::getPrice).sum();
    }
}
