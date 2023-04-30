package org.example.task_1;

/*3*)Создать систему управления складом(SOLID)
a)Product должен хранит информацию о товаре, такую как название, количество, цена и тд. (decreaseQuantity(int amount) , increaseQuantity(int amount))
b)Warehouse должен управлять запасами товаров на складе, обеспечивает их хранение и выдачу.(добавление/удаление продукта, увеличение/уменьшение количества продукта)
c)Order должен отвечать за обработку заказов на товары со склада. (processOrder(Product product, int amount)- обработка заказа)*/

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
    }
}