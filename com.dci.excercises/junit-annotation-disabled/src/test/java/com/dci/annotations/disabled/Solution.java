package com.dci.annotations.disabled;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution {


    @Test
    @Disabled
    @DisplayName("Method-1")
    public void testMethod1(){
        System.out.println("I am test method 1");
    }

    @Test
    @DisplayName("Method-2")
    public void testMethod2(){
        System.out.println("I am test method 2");
    }

}
