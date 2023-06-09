package org.example;

import java.util.List;

public class ShopService implements ProductRepo, OrderRepo {

    Product productResult;
    Order orderResult;
    public List<Product> listProducts(){
        return productRepo;
    }

    public Product get(String name){
        for(Product product: productRepo){
            if(product.getName().equals(name)) productResult = product;
        }
         return productResult;
    }

    public Product addProduct(Product product){
        productRepo.add(product);
        return product;
    }

    /* ========================== Order ============================== */

    public List<Order> listOrders(){
        return orderRepo;
    }

    public Order get(int id){
        for(Order order:orderRepo){
        if(order.getId() == id) return orderResult = order;
        }
        return orderResult;
    }

    public Order addOrder(Order order){
        orderRepo.add(order);
        return order;
    }

}
