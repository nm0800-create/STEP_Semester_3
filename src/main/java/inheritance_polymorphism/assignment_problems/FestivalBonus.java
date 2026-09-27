package inheritance_polymorphism.assignment_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    protected String name;
    protected double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    abstract double calculateBonus();
}

class FullTime extends Employee {
    public FullTime(String n, double s) { super(n, s); }
    @Override double calculateBonus() { return salary * 0.10; }
}

class PartTime extends Employee {
    public PartTime(String n, double s) { super(n, s); }
    @Override double calculateBonus() { return salary * 0.05; }
}

class Intern extends Employee {
    public Intern(String n, double s) { super(n, s); }
    @Override double calculateBonus() { return 2000; }
}

public class FestivalBonus {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTime("Asha", 50000));
        employees.add(new PartTime("Ravi", 30000));
        employees.add(new Intern("Neha", 15000));
        
        double total = 0;
        for (Employee e : employees) {
            double bonus = e.calculateBonus();
            System.out.printf("%s: %.2f%n", e.name, bonus);
            total += bonus;
        }
        System.out.printf("Total Bonus: %.2f%n", total);
    }
}
