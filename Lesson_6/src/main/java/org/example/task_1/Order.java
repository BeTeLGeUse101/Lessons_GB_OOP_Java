package org.example.task_1;

public class Order implements FunctionStock{

    private final Warehouse warehouse;

    private static Integer idOrder = 0;

    public Order() {
        ++idOrder;
        warehouse = new Warehouse();
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    private Warehouse getWarehouse() {
        return warehouse;
    }

    @Override
    public String toString() {
        return String.format("Order №%d: Склад:\n" + getWarehouse(), getIdOrder());
    }

    @Override
    public void addProduct(Integer id, String nameProduct, Integer quantity, Double price) {
        getWarehouse().addProduct(id, nameProduct, quantity, price);
    }

    @Override
    public void deleteProduct(int numberInStock) {
        getWarehouse().deleteProduct(numberInStock);
    }

    @Override
    public void increaseProduct(Integer numberProduct, Integer numberIncrease) {
        getWarehouse().increaseProduct(numberProduct, numberIncrease);
    }

    @Override
    public void decreaseProduct(Integer numberProduct, Integer numberDecrease) {
        getWarehouse().decreaseProduct(numberProduct,numberDecrease);
    }
}
