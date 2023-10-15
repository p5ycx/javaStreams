package com.test.employee;


import java.math.BigDecimal;

public class Employee {

    private int id;
    private String name;

    private BigDecimal salary;

    private Department department;

    public Employee(int id, String name, BigDecimal salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void createEmployee(int id, String name, BigDecimal salary, Department department) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department = department;
    }

    public void printEmployeeDetails() {
        System.out.println("id: " +id + " name : "+name+ " salary : "+salary +" department: "+ department);
    }
}
