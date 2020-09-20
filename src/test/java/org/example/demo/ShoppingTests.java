package org.example.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTests {
    @BeforeClass
    public void beforeClass(){
        System.out.println("before shopping tests class executed");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @Test
    public void productSearch(){
        System.out.println("searching for a product");
    }

    @Test
    public void addProductToShoppingCart(){
        System.out.println("Adding a product to shopping cart ");
    }
}
