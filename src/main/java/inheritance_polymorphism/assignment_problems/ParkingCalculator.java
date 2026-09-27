package inheritance_polymorphism.assignment_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    protected int hours;
    
    public Vehicle(int hours) {
        this.hours = hours;
    }
    
    abstract double calculateCharge();
}

class Bike extends Vehicle {
    public Bike(int h) { super(h); }
    @Override double calculateCharge() { return hours * 10; }
}

class Car extends Vehicle {
    public Car(int h) { super(h); }
    @Override double calculateCharge() { return 30 + ((hours - 1) * 20); }
}

class Truck extends Vehicle {
    public Truck(int h) { super(h); }
    @Override double calculateCharge() { return Math.max(hours * 50, 100); }
}

public class ParkingCalculator {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bike(3));
        vehicles.add(new Car(4));
        vehicles.add(new Truck(1));
        vehicles.add(new Car(1));
        
        double total = 0;
        for (Vehicle v : vehicles) {
            double charge = v.calculateCharge();
            System.out.printf("%.2f%n", charge);
            total += charge;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
