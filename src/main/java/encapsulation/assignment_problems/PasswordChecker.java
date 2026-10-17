package encapsulation.assignment_problems;

public class PasswordChecker {
    private final String password;

    public PasswordChecker(String password) {
        this.password = password;
    }

    public String getStrength() {
        int len = password.length();
        if (len < 6) return "Weak";
        if (len < 10) return "Medium";
        return "Strong";
    }

    public static void main(String[] args) {
        System.out.println(new PasswordChecker("abcd").getStrength());        // Weak
        System.out.println(new PasswordChecker("abcdefgh").getStrength());    // Medium
        System.out.println(new PasswordChecker("abcdefghijkl").getStrength()); // Strong
    }
}
