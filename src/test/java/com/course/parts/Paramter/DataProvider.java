package com.course.parts.Paramter;

import org.testng.annotations.Test;

public class DataProvider {

    @Test
    public void testDataProvider(String name,int age){
        System.out.println("name = "+ name + "; age = "+ age);
    }


    @DataProvider()
    public Object[][] providerData(){
        Object[][] O=new Object[][]{
                {"zs",10},
                {"ls",20},
                {"ww",30}
        };
    }
}
