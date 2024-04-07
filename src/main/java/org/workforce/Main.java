package org.workforce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       List<Employee> employee = EmployeeDatabase.getEmployees();
        // THINK OF STREAMS AS A CONVEYOR BELT. STREAMS ARE NON-DESTRUCTIVE.
        employee.stream()
                .filter(elementsFiltered -> elementsFiltered.getSalary() < 1000)
                .forEach(element -> System.out.println(element.getFirstName() + " " + element.getAge()));


        // TO CREATE A NEW LIST, AND PUT THE FILTER INTO A NEW COLLECTION (ORIGINAL employee list stays the same
        List<Employee> femaleworkers = employee.stream()
                .filter(filterFemales -> filterFemales.getGender() == 'F')
                .collect(Collectors.toList());

        Employee.header();
        for (Employee emp : femaleworkers) {
            System.out.print(emp);
        }


    }
}