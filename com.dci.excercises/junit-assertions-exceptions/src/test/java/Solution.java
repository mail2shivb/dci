import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Solution {

    private Employee employee;

    @Test
    @DisplayName("Verify exception handling")
    public void verifyException() {

        assertThrows(IllegalArgumentException.class, () -> new Employee(1001, "Hugo", null, new String[]{"sales", "admin"}));
    }

}
