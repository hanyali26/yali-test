package com.course.parts;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void Ignore1(){
        System.out.println("ignore1 excute");
    }
    @Test(enabled=false)
    public void Ignore2(){
        System.out.println("ignore2 excute");
    }
}
