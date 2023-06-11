package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    public List<Order> orders = new ArrayList<>();
    Order result;

    public Order addOrder(Order order) {
        orders.add(order);
        return order;
    }

    public List<Order> listOrders() {
        return orders;
    }

    public Order getOrder(int id) {
        for (Order order : orders) {
            if (order.getId() == id) result = order;
        }
        return result;
    }
}
