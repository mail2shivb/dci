import java.util.List;

public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private List<String> departments;

    public Employee(int empId, String firstName, String lastName, List<String> departments) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departments = departments;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getDepartments() {
        return departments;
    }
}
