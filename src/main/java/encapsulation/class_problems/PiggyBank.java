package encapsulation.class_problems;

public class PiggyBank {
    private final String id;
    private int savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) savings += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0 || amount > savings) return false;
        savings -= amount;
        return true;
    }

    public int getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        System.out.println("savings = " + pb.getSavings());   // 100
        pb.withdraw(30);
        System.out.println("savings = " + pb.getSavings());   // 70
        System.out.println(pb.withdraw(500));                  // false (rejected)
        System.out.println("savings = " + pb.getSavings());   // 70
    }
}
