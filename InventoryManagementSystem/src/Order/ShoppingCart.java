package Order;

import Items.GroceryItem;
import Items.InventoryItem;
import Managment.InventoryManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    private List<InventoryItem> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public List<InventoryItem> getCart() {
        return cart;
    }

    public ShoppingCart setCart(List<InventoryItem> cart) {
        this.cart = cart;
        return this;
    }


    public void addItemToShoppingCart(InventoryItem item, InventoryManagement inventoryManagement, Scanner scanner) throws IOException {
        System.out.print("How much of the product do you want to buy(quantity,count)? ");
        int quantity = Integer.parseInt(scanner.nextLine());

        if (item.getQuantity() > 0 && quantity <= item.getQuantity()) {
            InventoryItem itemToAdd = null;

            // If item is a GroceryItem, handle weight separately
            if (item instanceof GroceryItem) {
                GroceryItem groceryItem = (GroceryItem) item;
                System.out.println("How many kilograms do you want to buy from the product?");
                System.out.print("We have: " + groceryItem.getWeight() + " kg available. ");
                double kg = Double.parseDouble(scanner.nextLine());

                if (kg > groceryItem.getWeight()) {
                    System.out.println("Invalid kilograms. Please enter a valid amount!");
                    return;
                } else {
                    itemToAdd = new GroceryItem(
                            groceryItem.getMaterial().name(),
                            groceryItem.getItemCategory().name(),
                            groceryItem.getName(),
                            groceryItem.getItemPrice(),
                            groceryItem.getDescription(),
                            quantity,
                            groceryItem.isBio(),
                            groceryItem.isSeasonal(),
                            groceryItem.isFresh(),
                            kg
                    );
                    groceryItem.setWeight(groceryItem.getWeight() - kg);
                }
            } else {
                itemToAdd = new InventoryItem(
                        item.getMaterial().name(),
                        item.getItemCategory().name(),
                        item.getName(),
                        item.getItemPrice(),
                        item.getDescription(),
                        quantity
                );
            }

            this.cart.add(itemToAdd);
            System.out.println("You successfully added " + item.getName() + " to your shopping cart!");

            // Update inventory
            if (item.getQuantity() - quantity <= 0) {
                inventoryManagement.removeItemByName(item.getName());
            } else {
                item.setQuantity(item.getQuantity() - quantity);
            }

            inventoryManagement.saveInventoryToFile("inventory.txt");
        } else {
            System.out.println("We don't have enough of this product. Sorry for the trouble.");
        }
    }


    public double bill() {
        double bill = 0;
        for (InventoryItem item : cart) {
            bill += item.calculateValue();
        }
        return bill;
    }
}
