package ClassStorage;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private int capacity;
    private List<Product> products;


    public Storage(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public Storage setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public List<Product> getProducts() {

        return products;
    }

    public Storage setProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    public double totalCost(List<Product> products){
        double cost = 0;
        for (Product product : products) {
            cost += product.getPrice() * product.getQuantity();
        }
        return cost;
    }
    public void addProduct(Product product){
        products.add(product);
        capacity -= product.getQuantity();
    }

}
