package abstraction_interfaces.assignment_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Ticket {
    protected int count;
    static final double CONVENIENCE_FEE = 20;
    
    public Ticket(int count) {
        this.count = count;
    }
    
    abstract double getPricePerTicket();
    
    double calculateTotal() {
        return (getPricePerTicket() + CONVENIENCE_FEE) * count;
    }
}

class RegularTicket extends Ticket {
    public RegularTicket(int c) { super(c); }
    @Override double getPricePerTicket() { return 150; }
}

class PremiumTicket extends Ticket {
    public PremiumTicket(int c) { super(c); }
    @Override double getPricePerTicket() { return 250; }
}

class RecinerTicket extends Ticket {
    public RecinerTicket(int c) { super(c); }
    @Override double getPricePerTicket() { return 400; }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        List<Ticket> bookings = new ArrayList<>();
        bookings.add(new RegularTicket(3));
        bookings.add(new PremiumTicket(2));
        bookings.add(new RecinerTicket(1));
        
        double total = 0;
        for (Ticket t : bookings) {
            double amount = t.calculateTotal();
            System.out.printf("%.2f%n", amount);
            total += amount;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
