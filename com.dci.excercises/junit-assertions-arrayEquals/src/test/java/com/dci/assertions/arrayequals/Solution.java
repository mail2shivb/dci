package com.dci.assertions.arrayequals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {

    private Employee employee;

    @BeforeEach
    public void setup() {

        employee = new Employee(1001, "Hugo", "Boss", new String[]{"sales", "admin"});
    }

    @Test
    @DisplayName("Verify Employee departments")
    public void verifyEmployeeDepartments() {
        String[] expected = new String[]{"sales", "admin"};
        assertArrayEquals(expected, employee.getDepartments(), "Employee departments do not match");
    }

}
