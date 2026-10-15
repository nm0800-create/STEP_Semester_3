package data_structures_algorithms.class_problems;

public class FactorialCalculation {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(0));
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}
