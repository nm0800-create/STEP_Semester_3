package strings.assignment_problems;

public class ATMPINValidator {
    
    public void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }
    
    public static void main(String[] args) {
        ATMPINValidator validator = new ATMPINValidator();
        
        System.out.println("=== ATM PIN Length Validator ===\n");
        
        validator.checkPinLength("482");
        validator.checkPinLength("4820");
        validator.checkPinLength("12345");
    }
}
