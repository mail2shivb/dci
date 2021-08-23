package com.dci.annotations.repeatedtest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    @DisplayName("Method-1")
    @RepeatedTest(5)
    public void testMethod1(){
        System.out.println("I am test method 1");
    }

}
