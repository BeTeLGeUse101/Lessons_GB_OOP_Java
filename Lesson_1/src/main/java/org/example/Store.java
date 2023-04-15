package org.example;
import java.util.ArrayList;

public class Store {
    private ArrayList<Category> categories;
    private ArrayList<User> users;

    public Store() {
        categories = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void buyProduct(User user, Product product) {
        user.getBasket().addProduct(product);
        for (Category category : categories) {
            if (category.getProducts().contains(product)) {
                category.getProducts().remove(product);
                break;
            }
        }
    }
}