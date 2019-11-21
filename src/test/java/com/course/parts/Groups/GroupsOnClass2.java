package com.course.parts.Groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2的stu11");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2的stu22");
    }

}
