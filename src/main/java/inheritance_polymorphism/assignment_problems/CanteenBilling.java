package inheritance_polymorphism.assignment_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Customer {
    protected double billAmount;
    
    public Customer(double amount) {
        this.billAmount = amount;
    }
    
    abstract double calculateFinalAmount();
}

class Student extends Customer {
    public Student(double a) { super(a); }
    @Override double calculateFinalAmount() { return billAmount * 0.90; } // 10% discount
}

class Staff extends Customer {
    public Staff(double a) { super(a); }
    @Override double calculateFinalAmount() { return billAmount * 0.95; } // 5% discount
}

class Guest extends Customer {
    public Guest(double a) { super(a); }
    @Override double calculateFinalAmount() { return billAmount + 10; } // +₹10 charge
}

public class CanteenBilling {

    public static void main(String[] args) {
        String[] types = {"STUDENT", "STAFF", "GUEST"};
        List<Customer> bills = new ArrayList<>();
        bills.add(new Student(200));
        bills.add(new Staff(300));
        bills.add(new Guest(150));
        double total = 0;
        for (int i = 0; i < bills.size(); i++) {
            double amount = bills.get(i).calculateFinalAmount();
            System.out.printf("%s: %.2f%n", types[i], amount);
            total += amount;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
