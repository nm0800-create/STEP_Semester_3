package data_structures_algorithms.class_problems;

public class EvenOddCounter {
    public static void main(String[] args) {
        countEvenOdd(new int[]{3, 8, 12, 5, 7, 10});
        countEvenOdd(new int[]{2, 4, 6, 8});
    }
    
    static void countEvenOdd(int[] numbers) {
        int even = 0, odd = 0;
        for (int n : numbers) {
            if (n % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
