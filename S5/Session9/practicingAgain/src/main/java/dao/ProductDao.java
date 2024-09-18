package dao;

import interfaces.Session9;
import models.Product;

import java.util.ArrayList;

public class ProductDao implements Session9 {

    ArrayList<Product> products = new ArrayList<>();

    @Override
    public boolean store(Object obj) {
        Product product = (Product) obj;
        products.add(product);
        return true;
    }

    @Override
    public void findByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }
}
