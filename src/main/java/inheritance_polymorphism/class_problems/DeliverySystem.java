package inheritance_polymorphism.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Delivery {
    protected double weight, distance;
    
    public Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
    
    abstract double calculateFee();
}

class StandardDelivery extends Delivery {
    public StandardDelivery(double w, double d) { super(w, d); }
    @Override double calculateFee() { return 5 + (weight * 0.50) + (distance * 0.10); }
}

class ExpressDelivery extends Delivery {
    public ExpressDelivery(double w, double d) { super(w, d); }
    @Override double calculateFee() { return 15 + (weight * 1.00) + (distance * 0.20); }
}

class InternationalDelivery extends Delivery {
    double customsFee;
    public InternationalDelivery(double w, double d, double cf) { 
        super(w, d); customsFee = cf;
    }
    @Override double calculateFee() { return 25 + (weight * 2.00) + (distance * 0.50) + customsFee; }
}

public class DeliverySystem {
    public static void main(String[] args) {
        List<Delivery> deliveries = new ArrayList<>();
        deliveries.add(new StandardDelivery(10, 50));
        deliveries.add(new ExpressDelivery(5, 20));
        deliveries.add(new InternationalDelivery(20, 100, 30));
        
        double total = 0;
        for (Delivery d : deliveries) {
            double fee = d.calculateFee();
            System.out.printf("%.2f%n", fee);
            total += fee;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
