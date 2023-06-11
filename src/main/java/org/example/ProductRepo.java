package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    public List<Product> products = new ArrayList<>();

    Product result;

    List<Product> listProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public Product getProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) result = product;
        }
        return result;
    }
}
