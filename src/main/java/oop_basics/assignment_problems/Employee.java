package oop_basics.assignment_problems;

public class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;
    
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }
    
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }
    
    public void printProfile() {
        System.out.printf("%s | %s | Rs %.1f | Intern: %b%n", empId, empName, salary, isIntern);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Employee Profile Creation ===\n");
        
        Employee permanent = new Employee("E-101", "Divya", 65000);
        Employee intern = new Employee("E-102", "Arjun");
        
        permanent.printProfile();
        intern.printProfile();
    }
}
