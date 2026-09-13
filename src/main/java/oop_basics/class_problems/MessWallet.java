package oop_basics.class_problems;

public class MessWallet {
    private double balance;
    
    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Negative balance not allowed. Starting with 0.");
            this.balance = 0;
        } else {
            this.balance = openingBalance;
        }
    }
    
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Reject: Amount must be positive");
            return;
        }
        balance += amount;
        System.out.printf("Balance after top-up: %.1f%n", balance);
    }
    
    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
            return;
        }
        balance -= amount;
        System.out.printf("Final balance: %.1f%n", balance);
    }
    
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Hostel Mess Wallet Management ===\n");
        
        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);
        wallet.deduct(1000);
    }
}
