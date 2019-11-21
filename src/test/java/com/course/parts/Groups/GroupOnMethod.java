package com.course.parts.Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups="server")
    public void test1(){
        System.out.println("this is test1");
    }

    @Test(groups="server")
    public void test2(){
        System.out.println("this is test2");
    }

    @Test(groups="client")
    public void test3(){
        System.out.println("this is test3");
    }

    @Test(groups="client")
    public void test4(){
        System.out.println("this is test4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("this is beforeGroupsOnServer");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("this is afterGroupsOnServer");
    }

}
