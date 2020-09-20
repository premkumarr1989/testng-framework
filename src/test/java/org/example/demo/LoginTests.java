package org.example.demo;

import junit.framework.AssertionFailedError;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite executed");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite executed");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test executed");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test exe...");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class method executed");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class method executed");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before method executed...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method executed.....");
    }
    @Test(priority = 1,testName = "Login test with valid username and password")
    public void loginWithValidUser(){
        System.out.println("Login test with valid user and password");
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(exp,act,"The words dont match");

    }

    @Test(priority = 2,testName = "Login test with invalid user")
    public void loginWithInvalidUser(){
        System.out.println("Login test with invalid user");
        Assert.fail("Invalid user login test failed");
    }

    @Test(priority = 3,testName = "verify home page title")
    public void homepageTest(){
        System.out.println("This is a home page test");
        String exp = "Homepage";
        String act = "Homepage";
        Assert.assertTrue(exp==act, "Home Page title is incorrect");


    }

    @Test(priority = 4, testName = "verify logout")
    public void logoutTest(){
        System.out.println("This is a logout test");

    }
}
