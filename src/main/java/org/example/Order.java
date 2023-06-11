package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private int id;

    private OrderStatus status;

    public List<Product> cart = new ArrayList<>();

    public Order(int id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status=" + status +
                ", cart=" + cart +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(cart, order.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cart);
    }
}
