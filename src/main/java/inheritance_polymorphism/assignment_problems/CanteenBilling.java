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
        List<Customer> bills = new ArrayList<>();
        bills.add(new Student(200));
        bills.add(new Staff(300));
        bills.add(new Guest(150));
        
        double total = 0;
        for (Customer c : bills) {
            double final_amt = c.calculateFinalAmount();
            System.out.printf("%.2f%n", final_amt);
            total += final_amt;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
