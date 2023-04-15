package org.example;

import java.util.ArrayList;

class Basket {
    private ArrayList<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
