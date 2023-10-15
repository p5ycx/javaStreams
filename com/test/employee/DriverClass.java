package com.test.employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverClass {
    static ArrayList<Employee> storage;
    public static void main(String[] args) {
        populateData();

        //Print all employees with more than 2000 salary using streams.

        List<Employee> salaryMoreThan2000 = storage.stream().filter(k -> k.getSalary().compareTo(BigDecimal.valueOf(2000)) > 0).collect(Collectors.toList());
        //salaryMoreThan2000.forEach(Employee::printEmployeeDetails);

        List<Employee> department3 = storage.stream().filter(employee -> employee.getDepartment().getId()==3).collect(Collectors.toList());
        department3.forEach(Employee::printEmployeeDetails);

        List<Employee> departmentNameTech = storage.stream().filter(employee -> employee.getDepartment().getName().equals("Tech")).collect(Collectors.toList());
        departmentNameTech.forEach(Employee::printEmployeeDetails);

        //find average of the salary of all employees
        System.out.println(storage.stream().map(Employee::getSalary).reduce(BigDecimal.ZERO, BigDecimal::add).divide(BigDecimal.valueOf(storage.size()), 0).setScale(2));

        //find average of no of people in each department

    }

    public static void populateData() {

        storage = new ArrayList<>();
        // Departments
        Department techDepartment = new Department(1, "Tech", 20);
        Department hrDepartment = new Department(2, "HR", 10);
        Department financeDepartment = new Department(3, "Finance", 15);
        Department salesDepartment = new Department(4, "Sales", 25);
        Department marketingDepartment = new Department(5, "Marketing", 18);

        // Employees
        storage.add(new Employee(1, "Rajesh", new BigDecimal(2000), techDepartment));
        storage.add(new Employee(2, "Monica", new BigDecimal(2500), hrDepartment));
        storage.add(new Employee(3, "Ross", new BigDecimal(1900), techDepartment));
        storage.add(new Employee(4, "Rachel", new BigDecimal(2100), financeDepartment));
        storage.add(new Employee(5, "Joey", new BigDecimal(2200), hrDepartment));
        storage.add(new Employee(6, "Phoebe", new BigDecimal(2100), marketingDepartment));
        storage.add(new Employee(7, "Chandler", new BigDecimal(2300), salesDepartment));
        storage.add(new Employee(8, "Mike", new BigDecimal(2400), techDepartment));
        storage.add(new Employee(9, "Ben", new BigDecimal(2200), financeDepartment));
        storage.add(new Employee(10, "Carol", new BigDecimal(2100), marketingDepartment));
        storage.add(new Employee(11, "Susan", new BigDecimal(1900), hrDepartment));
        storage.add(new Employee(12, "Emily", new BigDecimal(2300), salesDepartment));
        storage.add(new Employee(13, "Janice", new BigDecimal(2000), marketingDepartment));
        storage.add(new Employee(14, "David", new BigDecimal(2500), techDepartment));
        storage.add(new Employee(15, "Charlie", new BigDecimal(1900), financeDepartment));
        storage.add(new Employee(16, "Richard", new BigDecimal(2400), salesDepartment));
        storage.add(new Employee(17, "Judy", new BigDecimal(2000), hrDepartment));
        storage.add(new Employee(18, "Jack", new BigDecimal(2100), marketingDepartment));
        storage.add(new Employee(19, "Nora", new BigDecimal(2500), techDepartment));
        storage.add(new Employee(20, "Charles", new BigDecimal(2100), financeDepartment));
        storage.add(new Employee(21, "Frank", new BigDecimal(2200), salesDepartment));
        storage.add(new Employee(22, "Amy", new BigDecimal(2000), marketingDepartment));
        storage.add(new Employee(23, "Paul", new BigDecimal(2500), hrDepartment));
        storage.add(new Employee(24, "Erin", new BigDecimal(2000), techDepartment));
        storage.add(new Employee(25, "Hank", new BigDecimal(2200), financeDepartment));
        storage.add(new Employee(26, "Bob", new BigDecimal(2400), marketingDepartment));
        storage.add(new Employee(27, "Linda", new BigDecimal(2500), hrDepartment));
        storage.add(new Employee(28, "Tom", new BigDecimal(2000), salesDepartment));
        storage.add(new Employee(29, "Sue", new BigDecimal(2300), marketingDepartment));
        storage.add(new Employee(30, "Gary", new BigDecimal(2400), techDepartment));

    }
}
