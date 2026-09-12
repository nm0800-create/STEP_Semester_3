package strings.class_problems;

public class BankTransactionReferenceValidator {
    
    public String normalizeReference(String raw) {
        String trimmed = raw.trim();
        
        if (trimmed.length() < 3) {
            return trimmed;
        }
        
        // Uppercase first 3 characters, keep rest as-is
        String first3 = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        
        return first3 + rest;
    }
    
    public String validateAndFormat(String code) {
        // Validate length: exactly 14 characters
        if (code.length() != 14) {
            return "Invalid: must be exactly 14 characters";
        }
        
        // Validate first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        
        // Validate remaining 11 characters are digits
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: remaining characters must be digits";
            }
        }
        
        // Format: [BANKCODE] DATE: dd/MM/yy | SEQ: 12345
        String bankCode = code.substring(0, 3);
        String dateStr = code.substring(3, 9); // ddMMyy
        String seqStr = code.substring(9, 14); // 5 digits
        
        return String.format("[%s] DATE: %s/%s/%s | SEQ: %s", 
                           bankCode, 
                           dateStr.substring(0, 2), 
                           dateStr.substring(2, 4), 
                           dateStr.substring(4, 6), 
                           seqStr);
    }
    
    public static void main(String[] args) {
        BankTransactionReferenceValidator validator = new BankTransactionReferenceValidator();
        
        System.out.println("=== Bank Transaction Reference Validator ===\n");
        
        String test1Raw = " hdf03022600042 ";
        String test1Norm = validator.normalizeReference(test1Raw);
        System.out.println("Test 1 - Raw: '" + test1Raw + "'");
        System.out.println("Normalized: " + test1Norm);
        System.out.println("Result: " + validator.validateAndFormat(test1Norm));
        System.out.println();
        
        String test2 = "12F03022600042";
        System.out.println("Test 2: " + test2);
        System.out.println("Result: " + validator.validateAndFormat(test2));
    }
}
