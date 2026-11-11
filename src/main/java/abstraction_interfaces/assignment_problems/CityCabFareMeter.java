package abstraction_interfaces.assignment_problems;

import java.util.ArrayList;
import java.util.List;

interface NightServiceCapable {
    boolean supportsNightService();
}

abstract class Cab {
    protected double distance;
    static final double MIN_FARE = 100;
    static final double NIGHT_MULTIPLIER = 1.2;
    
    public Cab(double distance) {
        this.distance = distance;
    }
    
    abstract double getRate();
    
    double calculateFare(String time) {
        double baseFare = Math.max(distance * getRate(), MIN_FARE);
        if ("NIGHT".equals(time)) {
            return baseFare * NIGHT_MULTIPLIER;
        }
        return baseFare;
    }
}

class Mini extends Cab {
    public Mini(double d) { super(d); }
    @Override double getRate() { return 10; }
}

class Sedan extends Cab implements NightServiceCapable {
    public Sedan(double d) { super(d); }
    @Override double getRate() { return 14; }
    @Override public boolean supportsNightService() { return true; }
}

class SUV extends Cab implements NightServiceCapable {
    public SUV(double d) { super(d); }
    @Override double getRate() { return 18; }
    @Override public boolean supportsNightService() { return true; }
}

public class CityCabFareMeter {

    public static void main(String[] args) {
        String[] types = {"MINI", "SEDAN", "SUV", "MINI"};
        List<Object[]> trips = new ArrayList<>();
        trips.add(new Object[]{new Mini(8), "DAY"});
        trips.add(new Object[]{new Sedan(10), "NIGHT"});
        trips.add(new Object[]{new SUV(20), "DAY"});
        trips.add(new Object[]{new Mini(5), "NIGHT"});
        double total = 0;
        for (int i = 0; i < trips.size(); i++) {
            Cab cab = (Cab) trips.get(i)[0];
            String time = (String) trips.get(i)[1];
            if ("NIGHT".equals(time) && !(cab instanceof NightServiceCapable)) {
                System.out.println(types[i] + ": night service not available");
            } else {
                double fare = cab.calculateFare(time);
                System.out.printf("%s: %.2f%n", types[i], fare);
                total += fare;
            }
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
