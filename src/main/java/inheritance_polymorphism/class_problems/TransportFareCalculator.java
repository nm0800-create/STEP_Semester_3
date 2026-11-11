package inheritance_polymorphism.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Transport {
    protected double distance;
    
    public Transport(double distance) {
        this.distance = distance;
    }
    
    abstract double calculateFare();
}

class Bus extends Transport {
    public Bus(double d) { super(d); }
    @Override double calculateFare() {
        double fare = 2 + (distance * 0.10);
        return Math.min(fare, 10);
    }
}

class Train extends Transport {
    public Train(double d) { super(d); }
    @Override double calculateFare() { return 3 + (distance * 0.15); }
}

class Metro extends Transport {
    double peakFactor;
    public Metro(double d, double pf) { super(d); peakFactor = pf; }
    @Override double calculateFare() { return (1.50 + (distance * 0.20)) * peakFactor; }
}

public class TransportFareCalculator {

    public static void main(String[] args) {
        String[] types = {"BUS", "TRAIN", "METRO"};
        List<Transport> journeys = new ArrayList<>();
        journeys.add(new Bus(15));
        journeys.add(new Train(50));
        journeys.add(new Metro(10, 1.5));
        double total = 0;
        for (int i = 0; i < journeys.size(); i++) {
            double fare = journeys.get(i).calculateFare();
            System.out.printf("%s: %.2f%n", types[i], fare);
            total += fare;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
