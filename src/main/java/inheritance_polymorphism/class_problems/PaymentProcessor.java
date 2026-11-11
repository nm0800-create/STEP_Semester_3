package inheritance_polymorphism.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Payment {
    protected double amount;
    
    public Payment(double amount) {
        this.amount = amount;
    }
    
    abstract double calculateFinalAmount();
}

class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }
    
    @Override
    double calculateFinalAmount() {
        return amount + (amount * 0.02); // 2% fee
    }
}

class WalletPayment extends Payment {
    public WalletPayment(double amount) {
        super(amount);
    }
    
    @Override
    double calculateFinalAmount() {
        return amount + (amount * 0.01); // 1% fee
    }
}

class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }
    
    @Override
    double calculateFinalAmount() {
        return amount; // No fee
    }
}

public class PaymentProcessor {

    public static void main(String[] args) {
        String[] types = {"CARD", "WALLET", "BANKTRANSFER"};
        List<Payment> transactions = new ArrayList<>();
        transactions.add(new CardPayment(1000));
        transactions.add(new WalletPayment(500));
        transactions.add(new BankTransferPayment(2000));
        double total = 0;
        for (int i = 0; i < transactions.size(); i++) {
            double amount = transactions.get(i).calculateFinalAmount();
            System.out.printf("%s: %.2f%n", types[i], amount);
            total += amount;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
