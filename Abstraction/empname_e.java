package Abstraction;
abstract class Employee {
 String name;
 int employeeId;
 
 public Employee(String name, int employeeId) {
     this.name = name;
     this.employeeId = employeeId;
 }
 abstract double calculateSalary();
 public String getDetails() {
     return "Name: " + name + ", Employee ID: " + employeeId;
 }
}
class SalariedEmployee extends Employee {
 double annualSalary;
 
 public SalariedEmployee(String name, int employeeId, double annualSalary) {
     super(name, employeeId);
     this.annualSalary = annualSalary;
 }
 @Override
 double calculateSalary() {
     return annualSalary / 12;
 }
}
class HourlyEmployee extends Employee {
 double hourlyRate;
 int hoursWorked;
 
 public HourlyEmployee(String name,int employeeId,double hourlyRate,int hoursWorked) {
     super(name, employeeId);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }
 @Override
 double calculateSalary() {
     return hourlyRate * hoursWorked;
 }
}

public class empname_e {
 public static void main(String[] args) {
     Employee salariedEmployee = new SalariedEmployee("ajay", 101, 600000);
     System.out.println(salariedEmployee.getDetails());
     System.out.println("Monthly Salary: " + salariedEmployee.calculateSalary());
     
     Employee hourlyEmployee = new HourlyEmployee("rahul", 102, 20, 160);
     System.out.println(hourlyEmployee.getDetails());
     System.out.println("Monthly Salary: " + hourlyEmployee.calculateSalary());
 }
}
