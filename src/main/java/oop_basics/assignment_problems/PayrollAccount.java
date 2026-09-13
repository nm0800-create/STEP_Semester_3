package oop_basics.assignment_problems;

public class PayrollAccount {
    private double basicSalary;
    private double bonus;
    
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Negative salary. Starting with 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }
    
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Reject: Bonus amount must be positive");
            return;
        }
        bonus += amount;
        System.out.printf("Bonus credited: Rs %.1f%n", amount);
    }
    
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Reject: Tax percent must be between 0 and 100");
            return;
        }
        basicSalary -= (basicSalary * percent / 100);
        System.out.printf("Tax deducted: %.0f%%%n", percent);
    }
    
    public double getNetSalary() {
        return basicSalary + bonus;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Payroll Salary Management ===\n");
        
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.printf("Net salary: Rs %.1f%n", account.getNetSalary());
    }
}
