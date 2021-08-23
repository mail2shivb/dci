package com.dci.assertions.assertall;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    private static Employee employee;

    @BeforeAll
    public static void setup() {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    @DisplayName("Verify Employee fields")
    public void verifyEmployeeFields() {

        assertAll("Employee",
                () -> assertEquals(1001, employee.getEmpId(), "Employee id does not match"),
                () -> assertEquals("Hugo", employee.getFirstName(), "Employee firstName does not match"),
                () -> assertEquals("Boss", employee.getLastName(), "Employee lastName does not match"),
                () -> assertEquals(500, employee.getSalary(), "Employee  salary does not match"));
    }


}
