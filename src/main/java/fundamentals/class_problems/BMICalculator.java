package fundamentals.class_problems;

import java.util.Random;

public class BMICalculator {
    
    public String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    public double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }
    
    public void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("=== Corporate Wellness Program Report ===\n");
        System.out.println("Person | Height (m) | Weight (kg) |    BMI    |    Status");
        System.out.println("-------|------------|------------|-----------|------------");
        
        int normalCount = 0;
        int underweightCount = 0;
        int overweightCount = 0;
        int obeseCount = 0;
        
        for (int i = 0; i < heights.length; i++) {
            double bmi = calculateBmi(weights[i], heights[i]);
            String status = getBmiStatus(bmi);
            
            System.out.printf("  %d    |   %.2f    |   %.2f   |  %.2f   |  %s%n", 
                            i + 1, heights[i], weights[i], bmi, status);
            
            // Count status categories
            if (status.equals("Normal")) {
                normalCount++;
            } else if (status.equals("Underweight")) {
                underweightCount++;
            } else if (status.equals("Overweight")) {
                overweightCount++;
            } else if (status.equals("Obese")) {
                obeseCount++;
            }
        }
        
        // Print summary statistics
        System.out.println("\n=== Summary Statistics ===");
        System.out.printf("Normal: %d | Underweight: %d | Overweight: %d | Obese: %d%n",
                         normalCount, underweightCount, overweightCount, obeseCount);
        double normalPercentage = (normalCount / (double) heights.length) * 100;
        System.out.printf("Healthy Status (Normal): %.1f%%%n\n", normalPercentage);
    }
    
    public static void main(String[] args) {
        BMICalculator calculator = new BMICalculator();
        
        // Create sample data (10 employees)
        double[] heights = {1.75, 1.60, 1.80, 1.65, 1.70, 1.55, 1.85, 1.72, 1.68, 1.63};
        double[] weights = {70, 90, 85, 55, 72, 48, 95, 78, 68, 62};
        
        calculator.printWellnessReport(heights, weights);
    }
}
