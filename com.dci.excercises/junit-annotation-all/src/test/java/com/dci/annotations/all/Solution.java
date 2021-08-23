package com.dci.annotations.all;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution {


    @BeforeEach
    public void setup(){
        System.out.println("I am setup method");
    }

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

    @AfterEach
    public void teardown(){
        System.out.println("I am teardown method");
    }
}
