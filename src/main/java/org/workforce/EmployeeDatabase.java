package org.workforce;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
    private static final List<Employee> employees = Arrays.asList(
            new Employee("Jonny", "Noxville", 'M', 54, "Admin", "Painter", 42000),
            new Employee("Alice", "Cooper", 'F', 33, "Engineering", "Engineer", 23250),
            new Employee("Max", "Verstappen", 'M', 47, "Admin", "Accountant", 36350),
            new Employee("Sarah", "Wrench", 'F', 28, "Engineering", "BodyTech", 39500),
            new Employee("Fernando", "Alonso", 'M', 41, "Engineering", "Electrician", 41000),
            new Employee("Michelle", "Yeoh", 'F', 38, "Admin", "QC Inspector", 106000),
            new Employee("David", "Beckham", 'M', 63, "Logistics", "Logistics Admin", 150000),
            new Employee("Diego", "Costa", 'M', 18, "Engineering", "Welder", 9000)
    );

    public static List<Employee> getEmployees() {
        return employees;
    }
}
