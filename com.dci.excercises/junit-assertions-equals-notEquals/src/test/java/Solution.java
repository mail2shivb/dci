import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Solution {

    private static Employee employee;

    @BeforeAll
    public static void setup() {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    @DisplayName("Verify Employee fields")
    public void verifyEmployeeFields() {

        assertEquals(1001, employee.getEmpId(), "Employee id does not match");
        assertEquals("Hugo", employee.getFirstName(), "Employee firstName does not match");
        assertEquals("Boss", employee.getLastName(), "Employee lastName does not match");
        assertEquals(500, employee.getSalary(), "Employee  salary does not match");
    }


    @Test
    @DisplayName("Verify Employee lastName ")
    public void verifyEmployeeFistName() {

        assertNotEquals("Boss", employee.getLastName(), "Employee lastName is not correct");
    }

}
