package dao;

import interfaces.Session9;
import models.Product;

import java.util.ArrayList;

public class ProductDao implements Session9 {

    ArrayList<Product> products = new ArrayList<>();

    @Override
    public boolean store(Object obj) {
        Product product = (Product) obj;

        try {
            products.add(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByName(String name) {
        try {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    System.out.println(product);
                    break;
                }
                System.out.println("Couldn't find product with name: " + product.getName());
            }
        } catch (Exception e) {
            System.out.printf("An error occurs trying to find product with the name " + name + "\nError: " + e.getMessage());
        }
    }
}
