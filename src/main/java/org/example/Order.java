package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.example.ProductRepo.productRepo;

public class Order {
    private int id;

    private OrderStatus status;

    public List<Product> orderList = new ArrayList<>();

    private Product product;

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

    public List<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Product> orderedProductsList) {
        this.orderList = orderList;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public boolean addProductToOrderList(Product product){
        boolean result = false;
            if(productRepo.contains(product)){
                System.out.println("product found");
                result = true;
                orderList.add(product);
                status = OrderStatus.Ordered;
            }else{
                System.out.println("product not found");
            }
            return result;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderList=" + orderList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(orderList, order.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderList);
    }
}
