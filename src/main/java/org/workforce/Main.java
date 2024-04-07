package org.workforce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(
                new Employee("Jonny", "Noxville", 'M',54,"Admin","Painter", 42000),
                new Employee("Alice", "Cooper", 'F',33,"Engineering","Engineer",  23250),
                new Employee("Max", "Verstappen", 'M',47,"Admin","Accountant", 36350),
                new Employee("Sarah", "Wrench", 'F',28,"Engineering","BodyTech",  39500),
                new Employee("Fernando", "Alonso", 'M',41,"Engineering","Electricion", 41000),
                new Employee("Michelle", "Yeoh", 'F',38,"Admin","QC Inspector", 106000),
                new Employee("David", "Beckham", 'M',63,"Logistics","Logistics Admin", 150000),
                new Employee("Diego", "Costa", 'M',18,"Engineering","Welder",  9000));


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