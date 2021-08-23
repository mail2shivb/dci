package com.dci.annotations.afterall;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution {


    @Test
    @DisplayName("Method-1")
    public void testMethod1(){
        System.out.println("I am test method 1");
    }

    @Test
    @DisplayName("Method-2")
    public void testMethod2(){
        System.out.println("I am test method 2");
    }

    @AfterAll
    public static void teardown(){
        System.out.println("I am teardown method");
    }
}
