package com.dci.assertions.assertall;

public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int empId, String firstName, String lastName, int salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

}
