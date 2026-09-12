package strings.class_problems;

public class MaskedPhoneNumberFormatter {
    
    public String maskPhoneNumber(String phone) {
        // Validate: exactly 10 digits
        if (phone.length() != 10) {
            return "Invalid phone number";
        }
        
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }
        
        // Build masked version: XXXXXX-last4digits
        String lastFour = phone.substring(6);
        return "XXXXXX-" + lastFour;
    }
    
    public static void main(String[] args) {
        MaskedPhoneNumberFormatter formatter = new MaskedPhoneNumberFormatter();
        
        System.out.println("=== Masked Phone Number Formatter ===\n");
        
        System.out.println("9876543210: " + formatter.maskPhoneNumber("9876543210"));
        System.out.println("98765: " + formatter.maskPhoneNumber("98765"));
        System.out.println("5551234567: " + formatter.maskPhoneNumber("5551234567"));
    }
}
