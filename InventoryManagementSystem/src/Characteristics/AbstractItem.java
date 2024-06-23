package Characteristics;

import enums.Category;
import enums.Material;

import java.time.LocalDate;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {

    protected String name;
    protected double price;
    protected String description;
    protected LocalDate dateAdded;
    protected Category category;
    protected Material material;

    public AbstractItem(String material,String category, String name, double price, String description) {
        this.material = Material.valueOf(material.toUpperCase());
        this.category = Category.valueOf(category.toUpperCase());
        this.name = name;
        this.price = price;
        this.description = description;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public AbstractItem setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public AbstractItem setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AbstractItem setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Double getItemPrice() {
        return this.price;
    }

    @Override
    public void setItemPrice(double price) {
        this.price = price;
    }

    @Override
    public Category getItemCategory() {
        return this.category;
    }

    @Override
    public void setItemCategory(Category category) {
        this.category = category;
    }

    public Material getMaterial() {
        return material;
    }

    public AbstractItem setMaterial(Material material) {
        this.material = material;
        return this;
    }

    @Override
    public String itemDescription() {
        return this.description;
    }

    public abstract void getItemDetails();

    public abstract boolean isItemBreakable();
    public abstract  double calculateValue();
    public abstract  boolean isItemPerishable();
}

