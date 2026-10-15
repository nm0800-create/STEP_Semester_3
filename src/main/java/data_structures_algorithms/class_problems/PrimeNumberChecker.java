package data_structures_algorithms.class_problems;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        printPrimality(29);
        printPrimality(21);
    }

    static void printPrimality(int n) {
        boolean prime = n > 1;
        for (int i = 2; (long) i * i <= n && prime; i++) {
            if (n % i == 0) prime = false;
        }
        System.out.println(n + (prime ? " is prime" : " is not prime"));
    }
}
