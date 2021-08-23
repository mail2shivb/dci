import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution {

    private static Employee employee;

    @BeforeAll
    public static void setup() {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    @DisplayName("Verify Employee Salary by using assertTrue")
    public void verifyEmployeeSalary() {

        assertTrue(500 == employee.getSalary(), "Employee salary does not match");
    }

    @Test
    @DisplayName("Verify Employee Salary by using assertFalse")
    public void verifyEmployeeSalaryNotZero() {

        assertFalse(employee.getSalary() == 0, "Employee salary should not be 0");
    }


    @Test
    @DisplayName("Verify Employee Salary greater than 100")
    public void verifyEmployeeSalaryGreaterThan100() {

        assertTrue(employee.getSalary() > 100, "Employee salary is not greater than 100");
    }
}
