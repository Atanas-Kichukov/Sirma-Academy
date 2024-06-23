package Items;

import Characteristics.AbstractItem;
import enums.Category;
import enums.Material;

public class InventoryItem extends AbstractItem {
    private static long nextId = 1;
    private Long id;
    private int quantity;

    public InventoryItem(String material,String category, String name, double price, String description, int quantity) {
        super(material,category, name, price, description);
        this.id = nextId++;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public InventoryItem setId(Long id) {
        this.id = id;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public InventoryItem setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public void getItemDetails() {
        System.out.printf("The item %s is %s and can be classified to the group of %s. " +
                "Its price is %.2f and has the following description: %s.%n",this.name,this.material.name(),this.category.name(),this.price,this.description);
    }

    @Override
    public boolean isItemBreakable() {
        return material == Material.GLASS || material == Material.CERAMIC;
    }

    @Override
    public void handleBreakage() {
    //TODO
    }

    @Override
    public double calculateValue() {
    return this.quantity * (this.price * category.getValue());

    }

    @Override
    public boolean isItemPerishable() {
        return category == Category.BAKERY
                || category == Category.FRUITS_VEGETABLES
                || category == Category.MEAT_SEAFOOD
                || category == Category.BEVERAGES;
    }

    @Override
    public void handleExpiration() {
    //TODO
    }
}
