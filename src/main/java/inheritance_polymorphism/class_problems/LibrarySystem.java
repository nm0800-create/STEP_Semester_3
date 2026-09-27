package inheritance_polymorphism.class_problems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    protected String title;
    protected LocalDate borrowDate;
    
    public LibraryItem(String title) {
        this.title = title;
        this.borrowDate = LocalDate.of(2023, 10, 26);
    }
    
    abstract int getBorrowingDays();
    
    LocalDate getDueDate() {
        return borrowDate.plusDays(getBorrowingDays());
    }
}

class Book extends LibraryItem {
    public Book(String title) { super(title); }
    @Override int getBorrowingDays() { return 14; }
}

class DVD extends LibraryItem {
    public DVD(String title) { super(title); }
    @Override int getBorrowingDays() { return 7; }
}

class Magazine extends LibraryItem {
    public Magazine(String title) { super(title); }
    @Override int getBorrowingDays() { return 3; }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("1984"));
        items.add(new DVD("The Matrix"));
        items.add(new Magazine("Forbes Issue 500"));
        
        for (LibraryItem item : items) {
            System.out.println(item.title + ": " + item.getDueDate());
        }
    }
}
