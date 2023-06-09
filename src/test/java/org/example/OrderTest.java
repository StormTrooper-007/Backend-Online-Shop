package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class OrderTest {

    Product product1 = new Product("bike", 1);
    Order order1 = new Order(1, OrderStatus.NotOrdered);

    List<Product> actual = new ArrayList<>();

    ShopService pRepo = new ShopService();

    @Test
    void yields_ListOfProducts(){
        //adds product to the product repository
        pRepo.addProduct(new Product("bike", 1));
        //adds product to the order list after checking the repo to see if the product is there
        order1.addProductToOrderList(product1);
        //gets the order list
        List<Product> expected = order1.getOrderList();
        actual.add(product1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void returns_if_product_was_added_to_the_order_list(){
        pRepo.addProduct(new Product("bike", 1));
        boolean expected = order1.addProductToOrderList(new Product("bike", 1));
        Assertions.assertTrue(expected);
    }

    @Test
    void yields_int(){
        int actual = 1;
        int expected = order1.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void check_if_added_product_has_ordered_status(){
        pRepo.addProduct(new Product("bike", 1));
        order1.addProductToOrderList(new Product("bike", 1));
        OrderStatus actual = order1.getStatus();
        OrderStatus expected = OrderStatus.Ordered;
        Assertions.assertEquals(expected, actual);
    }
}
