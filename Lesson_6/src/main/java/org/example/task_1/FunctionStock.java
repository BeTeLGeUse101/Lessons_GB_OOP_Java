package org.example.task_1;

public interface FunctionStock {
    void addProduct(Integer id, String nameProduct, Integer quantity, Double price);
    void deleteProduct(int numberInStock);
    void increaseProduct(Integer numberProduct, Integer numberIncrease);
    void decreaseProduct(Integer numberProduct, Integer numberDecrease);
}
