package org.example;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product("Помидоры", 10.0, 5);
        Product product2 = new Product("Огурцы", 20.0, 4);
        Product product3 = new Product("Сметана", 30.0, 3);
        Product product4 = new Product("Масло", 40.0, 2);
        Product product5 = new Product("Картошка", 50.0, 1);

        Category category1 = new Category("Категория 1");
        category1.addProduct(product1);
        category1.addProduct(product2);
        category1.addProduct(product3);
        Category category2 = new Category("Категория 2");
        category2.addProduct(product4);
        category2.addProduct(product5);

        store.addCategory(category1);
        store.addCategory(category2);

        // вывод продуктов магазина
        System.out.println("Каталог супермаркета:");
        for (Category category : store.getCategories()) {
            System.out.println(category.getName());
            for (Product product : category.getProducts()) {
                System.out.println("- " + product.getName() + " (" + product.getPrice() + " $, рейтинг "
                        + product.getRating() + ")");
            }
        }

        User user1 = new User("Сергей", "admin123");
        User user2 = new User("Иван", "nimda321");

        store.addUser(user1);
        store.addUser(user2);

        store.buyProduct(user1, product1);
        store.buyProduct(user2, product4);

        // вывод товаров, который купил каждый покупатель
        System.out.println("--------------------");
        System.out.println("Покупки покупателей:");
        for (User user : store.getUsers()) {
            System.out.println(user.getLogin());
            for (Product product : user.getBasket().getProducts()) {
                System.out.println("- " + product.getName() + " (" + product.getPrice() + " $, рейтинг "
                        + product.getRating() + ")");
            }
        }

        // вывод продуктов магазина
        System.out.println("--------------------");
        System.out.println("Обновленный каталог супермаркета:");
        for (Category category : store.getCategories()) {
            System.out.println(category.getName());
            for (Product product : category.getProducts()) {
                System.out.println("- " + product.getName() + " (" + product.getPrice() + " $, рейтинг "
                        + product.getRating() + ")");
            }
        }
    }
}