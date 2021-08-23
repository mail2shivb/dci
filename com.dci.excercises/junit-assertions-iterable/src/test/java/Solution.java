import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class Solution {

    private Employee employee;

    @BeforeEach
    public void setup() {

        employee = new Employee(1001, "Hugo", "Boss", Arrays.asList("sales", "admin"));
    }

    @Test
    @DisplayName("Verify Employee departments")
    public void verifyEmployeeDepartments() {
        List expected = Arrays.asList("sales", "admin");
        assertIterableEquals(expected, employee.getDepartments(), "Employee departments do not match");
    }

}
