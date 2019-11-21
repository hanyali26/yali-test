package com.course.parts;



import org.testng.annotations.*;

public class OneClassTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("begin");
    }

    @Test
    public void helloWorldTest(){
        System.out.println("hello world");
    }
    @Test
    public void testCase1(){
        System.out.println("this is testcase1");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("end");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("this is beforeclass");
    }

    @AfterClass
    public void afterclass() {
        System.out.println("this is afterclass");
    }

    @BeforeSuite
    public void beforesuite() {
        System.out.println("this is beforesuite");
    }

    @AfterSuite
    public void aftersuite() {
        System.out.println("this is aftersuite");
    }



}
