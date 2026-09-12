package fundamentals.class_problems;

public class CustomerNameReverser {
    
    public String reverseCustomerName(String customerName) {
        if (customerName == null || customerName.length() == 0) {
            return customerName;
        }
        
        String reversed = "";
        
        // Traverse the string from end to beginning
        for (int i = customerName.length() - 1; i >= 0; i--) {
            reversed += customerName.charAt(i);
        }
        
        return reversed;
    }
    
    // Alternative approach using character array
    public String reverseCustomerNameArray(String customerName) {
        if (customerName == null || customerName.length() == 0) {
            return customerName;
        }
        
        // Convert to character array
        char[] chars = customerName.toCharArray();
        
        // Reverse the array in place
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // Swap
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        // Convert back to string
        return new String(chars);
    }
    
    public void displayNameAndReverse(String customerName) {
        String reversed = reverseCustomerName(customerName);
        
        System.out.printf("Original Name: %s%n", customerName);
        System.out.printf("Reversed Name: %s%n", reversed);
        System.out.println();
    }
    
    public static void main(String[] args) {
        CustomerNameReverser reverser = new CustomerNameReverser();
        
        System.out.println("=== Customer Identity Verification System ===\n");
        
        reverser.displayNameAndReverse("Sunil");
        reverser.displayNameAndReverse("Naman");
        reverser.displayNameAndReverse("Priya");
        reverser.displayNameAndReverse("Alice");
    }
}
