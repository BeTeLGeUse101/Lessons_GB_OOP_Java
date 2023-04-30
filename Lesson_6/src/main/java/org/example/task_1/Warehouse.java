package org.example.task_1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements FunctionStock{
    private final List<Product> stock;
    private Integer quantityStock;

    protected Warehouse() {
        stock = new ArrayList<>();
    }

    protected Product getProductStock(Integer numberProduct) {
        return getStock().get(numberProduct);
    }

    protected void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }

    protected Integer getQuantityStock() {
        return quantityStock;
    }

    protected List<Product> getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return getStock().toString();
    }

    @Override
    public void addProduct(Integer id, String nameProduct, Integer quantity, Double price) {
        getStock().add(new Product(id, nameProduct, quantity, price));
    }

    @Override
    public void deleteProduct(int numberInStock) {
        getStock().remove(numberInStock);
    }

    @Override
    public void increaseProduct(Integer numberProduct, Integer numberIncrease) {
        getStock().get(numberProduct).setQuantity(getStock().get(numberProduct).getQuantity() + numberIncrease);
    }

    @Override
    public void decreaseProduct(Integer numberProduct, Integer numberDecrease) {
        if (getStock().get(numberProduct).getQuantity() > numberDecrease)
            getStock().get(numberProduct).setQuantity(getStock().get(numberProduct).getQuantity() - numberDecrease);
        else getStock().get(numberProduct).setQuantity(0);
    }
}