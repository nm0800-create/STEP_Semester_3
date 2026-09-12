package fundamentals.assignment_problems;

public class AnalyzeInventory {
    
    public void analyzeInventory(int[] sectionA, int[] sectionB) {
        // Compute total quantities in each section
        int totalA = 0;
        int totalB = 0;
        
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
        }
        
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
        }
        
        // Determine balance status
        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";
        
        // Find highest quantity and its location
        int highestQuantity = sectionA[0];
        String highestLocation = "Section A";
        int highestIndex = 1; // 1-indexed for display
        
        // Check section A
        for (int i = 1; i < sectionA.length; i++) {
            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestLocation = "Section A";
                highestIndex = i + 1;
            }
        }
        
        // Check section B
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestLocation = "Section B";
                highestIndex = i + 1;
            }
        }
        
        // Print results
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)%n",
                         totalA, totalB, status, highestQuantity, highestLocation, highestIndex);
    }
    
    public static void main(String[] args) {
        AnalyzeInventory analyzer = new AnalyzeInventory();
        
        // Test case 1: Balanced inventory
        System.out.println("Test 1 - sectionA={20,15,30}, sectionB={25,10,30}");
        analyzer.analyzeInventory(new int[]{20, 15, 30}, new int[]{25, 10, 30});
        
        System.out.println();
        
        // Test case 2: Unbalanced inventory with different highest
        System.out.println("Test 2 - sectionA={10,20,15}, sectionB={15,10,20}");
        analyzer.analyzeInventory(new int[]{10, 20, 15}, new int[]{15, 10, 20});
    }
}
