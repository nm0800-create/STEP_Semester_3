package strings.assignment_problems;

public class LibraryISBNNormalizer {
    
    public String normalizeCode(String raw) {
        String trimmed = raw.trim();
        
        if (trimmed.length() < 3) {
            return trimmed;
        }
        
        String first3 = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        
        return first3 + rest;
    }
    
    public String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: wrong length (must be 13 characters)";
        }
        
        // First 3 chars must be letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }
        
        // Remaining 10 must be digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: remaining characters must be digits";
            }
        }
        
        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7); // 4 digits for year
        String catalog = code.substring(7, 13); // 6 digits for catalog
        
        return String.format("[%s] YEAR: %s | CATALOG: %s", pubCode, year, catalog);
    }
    
    public static void main(String[] args) {
        LibraryISBNNormalizer normalizer = new LibraryISBNNormalizer();
        
        System.out.println("=== Library ISBN Normalizer & Validator ===\n");
        
        String test1Raw = " pen2026004251 ";
        String test1Norm = normalizer.normalizeCode(test1Raw);
        System.out.println("Test 1 - Raw: '" + test1Raw + "'");
        System.out.println("Normalized: " + test1Norm);
        System.out.println("Result: " + normalizer.validateAndFormat(test1Norm));
        System.out.println();
        
        String test2 = "12N2026004251";
        System.out.println("Test 2: " + test2);
        System.out.println("Result: " + normalizer.validateAndFormat(test2));
    }
}
