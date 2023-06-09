package org.example;

import java.util.ArrayList;
import java.util.List;

public interface OrderRepo {

    public List<Order> orderRepo = new ArrayList<>();

    public Order addOrder(Order order);

    public List<Order> listOrders();

    public Order get(int id);

}
