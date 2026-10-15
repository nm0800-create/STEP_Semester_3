package data_structures_algorithms.class_problems;

public class LeapYearDetector {
    public static void main(String[] args) {
        System.out.println(isLeap(2024) ? "Leap year" : "Not a leap year");
        System.out.println(isLeap(1900) ? "Leap year" : "Not a leap year");
        System.out.println(isLeap(2000) ? "Leap year" : "Not a leap year");
    }

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
