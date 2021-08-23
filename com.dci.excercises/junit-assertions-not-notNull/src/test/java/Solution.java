import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution {

    private static Employee employee;

    @BeforeAll
    public static void setup() {
        employee = new Employee(1001, "Hugo", null, 500);
    }

    @Test
    @DisplayName("Verify Employee lastName is null")
    public void verifyEmployeeLastName() {

        assertNull(employee.getLastName(), "Employee lastName should be null");
    }

    @Test
    @DisplayName("Verify Employee Salary is not null")
    public void verifyEmployeeSalary() {

        assertNotNull(employee.getSalary(), "Employee salary should not be null");
    }

}
