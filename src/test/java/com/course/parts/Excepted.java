package com.course.parts;


import org.testng.annotations.Test;

public class Excepted {

    @Test(expectedExceptions =RuntimeException.class )
    public void runTimeExceptionFailed(){
        System.out.println("failed test ");
    }

    @Test(expectedExceptions =RuntimeException.class )
    public void runTimeExceptionSuccess(){
        System.out.println("success test ");
        throw new RuntimeException();
    }

}
