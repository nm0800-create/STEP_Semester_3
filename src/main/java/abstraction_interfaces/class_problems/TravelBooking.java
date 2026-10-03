package abstraction_interfaces.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class TravelMode {
    protected double distance;
    static final double BOOKING_FEE = 50;
    
    public TravelMode(double distance) {
        this.distance = distance;
    }
    
    abstract double calculateFare();
    
    double calculateTotal() {
        return calculateFare() + BOOKING_FEE;
    }
}

class Bus extends TravelMode {
    public Bus(double d) { super(d); }
    @Override double calculateFare() { return distance * 2; }
}

class Train extends TravelMode {
    public Train(double d) { super(d); }
    @Override double calculateFare() { return distance * 1.5; }
}

class Flight extends TravelMode {
    public Flight(double d) { super(d); }
    @Override double calculateFare() { return 2500 + (distance * 4); }
}

public class TravelBooking {
    public static void main(String[] args) {
        List<TravelMode> bookings = new ArrayList<>();
        bookings.add(new Bus(200));
        bookings.add(new Train(300));
        bookings.add(new Flight(500));
        
        for (TravelMode b : bookings) {
            System.out.printf("%.2f%n", b.calculateTotal());
        }
    }
}
