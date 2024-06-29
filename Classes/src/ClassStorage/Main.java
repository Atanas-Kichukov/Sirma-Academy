package ClassStorage;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("cucumber",1.50,15);
        Product product2 = new Product("tomato",0.90,25);
        Product product3 = new Product("bread",1.10,8);

        Storage storage = new Storage(50);
        storage.addProduct(product1);
        storage.addProduct(product2);
        storage.addProduct(product3);

        List<Product> products = storage.getProducts();
        for (Product product : products) {
            System.out.println(product.getName());
        }

        System.out.println(storage.getCapacity());
        System.out.println(storage.totalCost(products));
    }
}
