package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    Product product = new Product("Bike", 1);
    @Test
    void yields_string(){

        String actual = "Bike";
        String expected = product.getName();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void yields_int(){
        int actual = 1;
        int expected = product.getId();
        Assertions.assertEquals(expected, actual);
    }
}
