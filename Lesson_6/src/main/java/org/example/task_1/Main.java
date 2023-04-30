package org.example.task_1;

/*3*)Создать систему управления складом(SOLID)
a)Product должен хранит информацию о товаре, такую как название, количество, цена и тд. (decreaseQuantity(int amount) , increaseQuantity(int amount))
b)Warehouse должен управлять запасами товаров на складе, обеспечивает их хранение и выдачу.(добавление/удаление продукта, увеличение/уменьшение количества продукта)
c)Order должен отвечать за обработку заказов на товары со склада. (processOrder(Product product, int amount)- обработка заказа)*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Выберите функцию:
                1. Создать ордер
                2. Выход
                Ввод:\s""");
        int in = scanner.nextInt();

        if (in == 1) {
            Order order = new Order();

            while (in != 5) {
                System.out.println("Ваш № ордера: " + order.getIdOrder());
                System.out.print("""
                        Выберите функцию:
                        1. Добавить товар
                        2. Удалить товар
                        3. Увеличить кол-во товара
                        4. Уменьшить кол-во товара
                        5. Выход
                        Ввод:\s""");
                in = scanner.nextInt();

                switch (in) {
                    case 1 -> {
                        int id;
                        String name;
                        int q;
                        double price;
                        System.out.println("Введите id, название, кол-во и цену:");
                        System.out.print("id товара: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Название товара: ");
                        name = scanner.nextLine();
                        System.out.print("Кол-во товара: ");
                        q = scanner.nextInt();
                        System.out.print("Цена: ");
                        scanner.nextLine();
                        price = scanner.nextDouble();
                        order.addProduct(id, name, q, price);
                        System.out.println("Товар добавлен на склад: " + order);
                    }
                    case 2 -> {
                        int num;
                        System.out.print("Введите номер стека для удаления товара: ");
                        num = scanner.nextInt();
                        order.deleteProduct(num);
                        System.out.println("Товар успешно удалён со склада: " + order);
                    }
                    case 3 -> {
                        int num2;
                        int incr;
                        System.out.println("Введите номер стека и увеличение кол-ва товара: ");
                        System.out.print("Стек: ");
                        num2 = scanner.nextInt();
                        System.out.print("Насколько увеличить кол-во товара: ");
                        incr = scanner.nextInt();
                        order.increaseProduct(num2, incr);
                        System.out.println("Успешно увеличено кол-во у указанного товара: " + order);
                    }
                    case 4 -> {
                        int num3;
                        int incr2;
                        System.out.println("Введите номер стека и уменьшение кол-ва товара: ");
                        System.out.print("Стек: ");
                        num3 = scanner.nextInt();
                        System.out.print("Насколько уменьшить кол-во товара: ");
                        incr2 = scanner.nextInt();
                        order.increaseProduct(num3, incr2);
                        System.out.println("Успешно уменьшено кол-во у указанного товара: " + order);
                    }
                    case 5 -> {
                        System.out.println("Выход из программы...");
                    }
                }
            }
        }
    }
}