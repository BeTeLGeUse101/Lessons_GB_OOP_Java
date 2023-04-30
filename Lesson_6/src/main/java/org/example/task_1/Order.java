package org.example.task_1;

public class Order {

    private Warehouse warehouse;

    private static Integer idOrder;

    public Order() {
        ++idOrder;
        new Warehouse();
    }



    public static Integer getIdOrder() {
        return idOrder;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    @Override
    public String toString() {
        return String.format("Order №%d: Склад:\n" + getWarehouse(), getIdOrder());
    }
}
