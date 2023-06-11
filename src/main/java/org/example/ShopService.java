package org.example;

import java.util.List;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    private Order order;

    public boolean addProductToCart(Product product) {
        boolean result = false;
        if (productRepo.products.contains(product)) {
            System.out.println("product found");
            result = true;
            order.cart.add(product);
            order.setStatus(OrderStatus.inCart);
        } else {
            System.out.println("product not found");
        }
        return result;
    }

    public Product getProduct(String productName) {
        return productRepo.getProduct(productName);
    }

    public List<Product> listProducts() {
        return productRepo.listProducts();
    }

    public Order addOrder(Order newOrder) {
        return orderRepo.addOrder(newOrder);
    }

    public Order getOrder(int id) {
        return orderRepo.getOrder(id);
    }

    public List<Order> listOrders() {
        return orderRepo.listOrders();
    }

}
