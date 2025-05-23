package com.oops;

import java.time.LocalDate;

//Abstract Class: Employee
abstract class Employee {
 private int employeeID;
 private String name;
 private String department;
 private LocalDate hireDate;

 public Employee(int employeeID, String name, String department, LocalDate hireDate) {
     this.employeeID = employeeID;
     this.name = name;
     this.department = department;
     this.hireDate = hireDate;
 }

 public int getEmployeeID() {
     return employeeID;
 }

 public String getName() {
     return name;
 }

 public String getDepartment() {
     return department;
 }

 public LocalDate getHireDate() {
     return hireDate;
 }

 // Abstract method to calculate salary
 public abstract double calculateSalary();

 // Display common employee details
 public void displayDetails() {
     System.out.println("Employee ID: " + employeeID);
     System.out.println("Name: " + name);
     System.out.println("Department: " + department);
     System.out.println("Hire Date: " + hireDate);
     System.out.println("Salary: " + calculateSalary());
 }
}

//Interface: BonusEligible
interface BonusEligible {
 double calculateBonus(); // Method to calculate the bonus
}

//Subclass: Manager
class Manager extends Employee implements BonusEligible {
 private double baseSalary;
 private double bonusPercentage; // Bonus as a percentage of base salary

 public Manager(int employeeID, String name, String department, LocalDate hireDate, double baseSalary, double bonusPercentage) {
     super(employeeID, name, department, hireDate);
     this.baseSalary = baseSalary;
     this.bonusPercentage = bonusPercentage;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + calculateBonus();
 }

 @Override
 public double calculateBonus() {
     return baseSalary * (bonusPercentage / 100);
 }
}

//Subclass: Developer
class Developer extends Employee implements BonusEligible {
 private double hourlyRate;
 private int hoursWorked;
 private double performanceBonus; // Bonus based on performance

 public Developer(int employeeID, String name, String department, LocalDate hireDate, double hourlyRate, int hoursWorked, double performanceBonus) {
     super(employeeID, name, department, hireDate);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
     this.performanceBonus = performanceBonus;
 }

 @Override
 public double calculateSalary() {
     return (hourlyRate * hoursWorked) + calculateBonus();
 }

 @Override
 public double calculateBonus() {
     return performanceBonus;
 }
}

//Subclass: Intern
class Intern extends Employee {
 private double monthlyStipend;

 public Intern(int employeeID, String name, String department, LocalDate hireDate, double monthlyStipend) {
     super(employeeID, name, department, hireDate);
     this.monthlyStipend = monthlyStipend;
 }

 @Override
 public double calculateSalary() {
     return monthlyStipend; // Interns have a fixed monthly stipend
 }
}

//Main Class to Test the Implementation
public class Main {
 public static void main(String[] args) {
     // Create instances of each subclass
     Employee manager = new Manager(101, "Alice", "Management", LocalDate.of(2020, 5, 10), 80000, 20); 
     Employee developer = new Developer(102, "Bob", "IT", LocalDate.of(2021, 3, 15), 50, 160, 500);  
     Employee intern = new Intern(103, "Charlie", "HR", LocalDate.of(2023, 6, 1), 1500);

     // Display details for each employee
     System.out.println("Manager Details:");
     manager.displayDetails();
     System.out.println("\nDeveloper Details:");
     developer.displayDetails();
     System.out.println("\nIntern Details:");
     intern.displayDetails();
 }
}

