package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.OrderRepo.orderRepo;
import static org.example.ProductRepo.productRepo;

public class ShopServiceTest {
    ShopService pRepo = new ShopService();
    ShopService orRepo = new ShopService();
    Product product1 = new Product("bike", 1);
    Order order1 = new Order(1, OrderStatus.NotOrdered);


    @Test
    void check_if_it_returns_order(){
        orRepo.addOrder(order1);
        Order actual = orRepo.get(1);

    }

    @Test
    void returns_list_of_orders(){
        orRepo.addOrder(order1);
        List<Order> actual = orRepo.listOrders();
        List<Order> expected = orderRepo;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void checks_if_it_adds_order_to_order_repo(){
        Order actual = orRepo.addOrder(order1);
        Order expected = order1;
    }

    @Test
    void check_if_it_returns_product(){
        Product actual = pRepo.addProduct(product1);
        Product expected = pRepo.get("bike");
    }
    @Test
    void returns_list_of_products(){
        pRepo.addProduct(product1);
        List<Product> actual = pRepo.listProducts();
        List<Product> expected = productRepo;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checks_if_it_adds_product_to_product_repo(){
        Product actual = pRepo.addProduct(product1);
        Product expected = product1;
    }
}
