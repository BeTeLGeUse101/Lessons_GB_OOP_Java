package org.example;
import java.util.ArrayList;

class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}