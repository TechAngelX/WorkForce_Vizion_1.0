package org.workforce;

import java.text.DecimalFormat;

public class Employee {
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private String dept;
    private String role;
    private int salary;

    public Employee(String firstName, String lastName, char gender, int age, String dept, String role, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.dept = dept;
        this.role = role;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedSalary = decimalFormat.format(salary);
        return String.format("%-15s %-15s %-8c %-7d %-22s %-26s £%-15s%n", firstName, lastName, gender, age, dept, role, formattedSalary);
    }

    static void header() {
        System.out.println("______________________________________________________________________________________________________________");
        System.out.printf("%-15s %-15s %-8s %-7s %-22s %-26s %-15s%n", "First Name", "Last Name", "Gender", "Age", "Dept.","Role", "Salary (£)");
        System.out.println("--------------------------------------------------------------------------------------------------------------");


    }
}