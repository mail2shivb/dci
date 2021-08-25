package com.dci.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Solution {

    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void verifyAddition() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.addition(2, 3));
    }


    @Test
    public void verifySubtraction() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.subtract(2, 3));
    }


    @Test
    public void verifyMultiplication() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.multiply(2, 3));
    }

    @Test
    public void verifyDivision() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.division(2, 3));
    }


    @Test
    public void verifyDivisionByZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(5, 0);
        });
        assertEquals("Cannot division by zero", exception.getMessage());
    }
}

