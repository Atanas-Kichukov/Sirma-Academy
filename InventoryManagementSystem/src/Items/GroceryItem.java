package Items;

import enums.Category;

import java.time.LocalDate;

public class GroceryItem extends InventoryItem {
    private boolean isBio;
    private boolean isSeasonal;
    private boolean isFresh;
    private double weight;

    public GroceryItem(String material, String category, String name,
                       double price, String description,
                       int quantity, boolean isBio,
                       boolean isSeasonal, boolean isFresh, double weight) {
        super(material, category, name, price, description, quantity);
        this.weight = weight;
        this.isBio = isBio;
        this.isSeasonal = isSeasonal;
        this.isFresh = isFresh;
    }

    public boolean isBio() {
        return isBio;
    }

    public GroceryItem setBio(boolean bio) {
        isBio = bio;
        return this;
    }

    public boolean isSeasonal() {
        return isSeasonal;
    }

    public GroceryItem setSeasonal(boolean seasonal) {
        isSeasonal = seasonal;
        return this;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public GroceryItem setFresh(boolean fresh) {
        isFresh = fresh;
        return this;
    }
    public double getWeight() {
        return weight;
    }

    public GroceryItem setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public double calculateValue() {
        double price = super.calculateValue() * weight;

        if (isBio) {
            price *= 1.2;
        }

        if (!isSeasonal && getItemCategory() == Category.FRUITS_VEGETABLES) {
            price += price * 0.3;
        }

        if (isFresh) {
            price += price * 0.4;
        }

        return price;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        if(isBio && isFresh) {
            System.out.printf("The product is bio and is fresh with weight %.2f.%n",this.weight);
        }else if(isBio){
            System.out.printf("The product is bio but it isn't fresh. It has weight - %.2f%n",this.weight);
        }else{
            System.out.printf("The product is fresh but it isn't bio. It has weight - %.2f%n",this.weight);
        }
    }
}
