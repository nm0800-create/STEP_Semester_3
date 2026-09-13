package oop_basics.assignment_problems;

public class EmployeeCompany {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;
    
    public EmployeeCompany(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }
    
    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.printf("Employees on record: %d%n", employeeCount);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Employee and Company Information ===\n");
        
        new EmployeeCompany("Alice", 60000);
        new EmployeeCompany("Bob", 65000);
        new EmployeeCompany("Carol", 70000);
        
        System.out.println("3 Employee objects created\n");
        EmployeeCompany.printCompanyInfo();
    }
}
