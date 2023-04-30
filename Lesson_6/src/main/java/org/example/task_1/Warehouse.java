package org.example.task_1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> stock;
    private Integer quantityStock;

    public Warehouse() {
        new ArrayList<>();
    }

    public void increaseQuantityProduct(Integer numberProduct, Integer numberIncrease) {
        getStock().get(numberProduct).setQuantity(getStock().get(numberProduct).getQuantity() + numberIncrease);
    }

    public void decreaseQuantityProduct(Integer numberProduct, Integer numberDecrease) {
        if (getStock().get(numberProduct).getQuantity() > numberDecrease)
            getStock().get(numberProduct).setQuantity(getStock().get(numberProduct).getQuantity() - numberDecrease);
        else getStock().get(numberProduct).setQuantity(0);
    }
    public void addProductInStock(Integer id, String nameProduct, Integer quantity, Double price) {
        stock.add(new Product(id, nameProduct, quantity, price));
    }

    public void deleteProductInStock(int numberInStock) {
        getStock().remove(numberInStock);
    }

    public Product getProductStock(Integer numberProduct) {
        return getStock().get(numberProduct);
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public List<Product> getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return stock.toString();
    }
}
