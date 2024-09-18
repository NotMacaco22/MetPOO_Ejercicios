package models;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products;

    //Constructor - Instantiate ArrayList
    public ProductManager() {this.products = new ArrayList<>();}

    public void addProduct(Product newProduct) {
        this.products.add(newProduct);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product getProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }




}
