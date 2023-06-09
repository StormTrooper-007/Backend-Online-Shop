package org.example;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepo {
    public List<Product> productRepo = new ArrayList<>();

    List<Product> listProducts();

   public Product addProduct(Product product);

    public Product get(String name);

}
