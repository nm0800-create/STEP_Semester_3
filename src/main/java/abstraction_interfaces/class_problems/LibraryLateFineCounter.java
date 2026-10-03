package abstraction_interfaces.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    protected String title;
    protected int daysLate;
    
    public LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }
    
    abstract double calculateFine();
}

class Book extends LibraryItem {
    public Book(String title, int days) { super(title, days); }
    @Override double calculateFine() { return daysLate * 2; }
}

class DVD extends LibraryItem {
    public DVD(String title, int days) { super(title, days); }
    @Override double calculateFine() { return Math.min(daysLate * 5, 50); }
}

class Magazine extends LibraryItem {
    public Magazine(String title, int days) { super(title, days); }
    @Override double calculateFine() { return daysLate * 1; }
}

public class LibraryLateFineCounter {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("Algebra", 4));
        items.add(new DVD("Inception", 12));
        items.add(new Magazine("Sports", 3));
        
        double total = 0;
        for (LibraryItem item : items) {
            double fine = item.calculateFine();
            System.out.printf("%s: %.2f%n", item.title, fine);
            total += fine;
        }
        System.out.printf("Total Fines: %.2f%n", total);
    }
}
