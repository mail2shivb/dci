package com.dci.annotations.parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Solution {


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testMethod1(int value) {
        System.out.println("I am test method " + value);
    }

}
