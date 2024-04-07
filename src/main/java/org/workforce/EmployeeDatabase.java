package org.workforce;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
    private static final List<Employee> employees = Arrays.asList(


            new Employee("Harry", "Orcise", 'M', 29, "Admin", "Company Secretary", 44000),
            new Employee("Fleur", "Delacour", 'F', 40, "C-Suite", "Chief Financial Officer", 70000),
            new Employee("Ollie", "Barracello", 'M', 51, "C-Suite", "Chief People Officer", 72000),
            new Employee("Karin", "Alderson", 'F', 51, "C-Suite", "Chief Technology Officer", 75950),
            new Employee("Steve", "Reid", 'M', 56, "C-Suite", "Chief Operating Officer", 78950),
            new Employee("Laura", "Branning", 'F', 45, "C-Suite", "Chief Sales Officer", 102000),
            new Employee("Kia", "Vannock", 'M', 45, "C-Suite", "Chief Executive Officer", 105000),

            new Employee("Minerva", "McGonagall", 'F', 39, "Engineering", "Civil Engineer", 68000),
            new Employee("Dolores", "Umbridge", 'F', 41, "Engineering", "Chemical Engineer", 66000),
            new Employee("Ginny", "West", 'F', 32, "Engineering", "Mechanical Engineer", 62000),
            new Employee("Cho", "Chang", 'M', 34, "Engineering", "Electrical Engineer", 63000),


            new Employee("Max", "Verstappen", 'M', 26, "Accounts & Finance", "Accounts Assistant", 26350),
            new Employee("Vincent", "Trapman", 'M', 32, "Accounts & Finance", "Accountant", 46350),
            new Employee("Lydia", "Ageymann", 'F', 47, "Accounts & Finance", "Senior Accountant", 56350),
            new Employee("Draco", "Malfoy", 'M', 30, "Accounts & Finance", "Financial Analyst", 61000),
            new Employee("Roy", "Kinnear", 'M', 23, "Accounts & Finance", "Purchasing Officer", 24350),
            new Employee("Eniola", "Ryman", 'F', 27, "Accounts & Finance", "Senior Purchasing Officer", 34350),


            new Employee("Bellatrix", "Lestrange", 'F', 18, "Logistics", "Courier", 19000),
            new Employee("Maria", "Palson", 'F', 32, "Logistics", "Dispatch Officer", 27000),
            new Employee("Georgia", "Ullman", 'F', 36, "Logistics", "Records Officer", 32000),
            new Employee("Uthman", "Nathaniel", 'M', 33, "Logistics", "Logistics Admin", 33000),

            new Employee("Nathalie", "Le Havre", 'F', 36, "Human Resources", "Payroll Officer", 34000),
            new Employee("Xander", "Hartmann", 'M', 31, "Human Resources", "Senior Payroll Officer", 37000),
            new Employee("Laura", "Smith", 'F', 36, "Human Resources", "Work Compliance Officer", 39000),
            new Employee("Fatimah", "Salah", 'F', 28, "Human Resources", "Health & Wellbeing Officer", 28950),
            new Employee("Andrew", "Yeoman", 'M', 25, "Human Resources", "HR Assistant", 26000),
            new Employee("Yolanda", "Cisse", 'F', 36, "Human Resources", "Senior HR Assistant", 29000),
            new Employee("George", "Jenman", 'M', 67, "Human Resources", "HR Manager", 57000),


            new Employee("Laura", "Smith", 'F', 42, "Operations", "Operations Analyst", 35000),
            new Employee("Zara", "Thomas", 'F', 42, "Operations", "EDI Officer", 30000),
            new Employee("Agnes", "Grey", 'F', 69, "Operations", "Health & Safety Assistant", 27000),
            new Employee("Fred", "Dinage", 'M', 42, "Operations", "Health & Safety Manager", 37000),
            new Employee("Peter", "uintero", 'M', 33, "Operations", "Production Manager", 37000),
            new Employee("Quinlan", "Jones", 'M', 45, "Operations", "Operations Manager", 55000),

            new Employee("Ed", "Harington", 'M', 37, "Legal", "Compliance Officer", 80000),
            new Employee("Harry", "Inman", 'M', 37, "Legal", "Compliance Officer", 80000),
            new Employee("Elicia", "Lupin", 'F', 37, "Legal", "Senior Compliance Officer", 80000),
            new Employee("Innes", "Kisnan", 'F', 37, "Legal", "Legal Officer", 80000),

            new Employee("Kelly", "Jons", 'F', 37, "Legal", "Legal Officer", 80000),

            new Employee("Kevin", "Osman", 'M', 37, "Legal", "Paralegal", 80000),

            new Employee("Oscar", "Reid", 'M', 38, "Legal", "Legal Counsel", 85000),

            new Employee("Robert", "Vaughan", 'M', 33, "Saleas & Marketing", "Business Development", 57000),
            new Employee("Vicki", "Allman", 'M', 33, "Saleas & Marketing", "Sales Assistant", 57000),
            new Employee("Allie", "McDonald", 'M', 33, "Saleas & Marketing", "Sales Representative", 57000),
            new Employee("Cedric", "McDonald", 'M', 33, "Saleas & Marketing", "Sales Representative", 57000),
            new Employee("Neville", "Bravemann", 'M', 28, "Saleas & Marketing", "Marketing Assistant", 48000),
            new Employee("Mo", "Hanmmah", 'M', 28, "Saleas & Marketing", "Marketing Specialist", 48000),
            new Employee("Billie", "Foster", 'F', 28, "Saleas & Marketing", "PR Officer", 48000),
            new Employee("Felicia", "Thorn", 'F', 28, "Saleas & Marketing", "Senior PR Officer", 48000),
            new Employee("Olatunda", "Traore", 'M', 28, "Saleas & Marketing", "Marketing Specialist", 48000),
            new Employee("Ela", "Iniesta", 'F', 28, "Saleas & Marketing", "Head of Marketing", 48000),

            new Employee("Hermione", "Jones", 'F', 35, "IT Services", "Software Developer", 60000),
            new Employee("Quentain", "Yarman", 'M', 31, "IT Services", "HR Manager", 55000),
            new Employee("Leah", "Monk", 'F', 26, "IT Services", "Junior Software Engineer", 36750),
            new Employee("George", "Weasley", 'M', 43, "IT Services", "Software Engineer", 49450),
            new Employee("Xavier", "Folonso", 'M', 32, "IT Services", "Software Engineer", 51000),
            new Employee("Dave", "Pierce", 'M', 32, "IT Services", "Network Adminostrator", 42000),
            new Employee("Luna", "Lovegood", 'F', 27, "IT Services", "Network Engineer", 58000),
            new Employee("Fred", "Weasley", 'M', 31, "IT Services", "UI/UX Designer", 33000),
            new Employee("Fred", "Weasley", 'M', 31, "IT Services", "Head of IT", 64000),


            new Employee("Jonny", "Noxville", 'M', 54, "Security and Estates", "Painter", 42000),
            new Employee("Fernando", "Alonso", 'M', 41, "Security and Estates", "Electrician", 41000),
            new Employee("Orla", "Brown", 'F', 27, "Security and Estates", "Security Officer", 28000),
            new Employee("Origi", "Folani", 'M', 29, "Security and Estates", "Security Officer", 29950),
            new Employee("Gael", "Porter", 'F', 26, "Security and Estates", "CCTV Officer", 29950),
            new Employee("Julian", "Wright", 'M', 29, "Security and Estates", "Maintenance", 27500),
            new Employee("Jonty", "Eismann", 'M', 29, "Security and Estates", "Handyman", 29950),
            new Employee("Origi", "Olugu", 'M', 29, "Security and Estates", "Estates Officer", 29950),
            new Employee("Will", "Browning", 'M', 35, "Security and Estates", "Head of Security", 46000),
            new Employee("Peter", "WHite", 'M', 42, "Security and Estates", "Head of Estates", 47000),


            new Employee("Mark", "Right", 'M', 26, "Customer Service", "Receptionist", 22520),
            new Employee("Jenine", "Brown", 'F', 21, "Customer Service", "Receptionist", 21000),
            new Employee("Laura", "Zeiluck", 'F', 23, "Customer Service", "Customer Service Admin", 24950),
            new Employee("Marty", "McFly", 'F', 23, "Customer Service", "Customer Service Admin", 24950),
            new Employee("Ricki", "Smith", 'M', 43, "Customer Service", "Customer Service Admin", 26950),
            new Employee("Lisa", "McDough", 'F', 25, "Customer Service", "Customer Service Support", 25000),
            new Employee("Martin", "Nolan", 'M', 36, "Customer Service", "Customer Service Manager", 36000)



    );

    public static List<Employee> getEmployees() {
        return employees;
    }
}
