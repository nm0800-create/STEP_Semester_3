package abstraction_interfaces.assignment_problems;

import java.util.ArrayList;
import java.util.List;

interface Insurable {
    double getInsurance();
}

abstract class Parcel {
    protected double weight, declaredValue;
    
    public Parcel(double w, double v) {
        weight = w;
        declaredValue = v;
    }
    
    abstract double calculateCharge();
}

class StandardParcel extends Parcel {
    public StandardParcel(double w, double v) { super(w, v); }
    @Override double calculateCharge() { return 40 + (weight * 10); }
}

class ExpressParcel extends Parcel implements Insurable {
    public ExpressParcel(double w, double v) { super(w, v); }
    @Override double calculateCharge() { return 80 + (weight * 15); }
    @Override public double getInsurance() { return declaredValue * 0.02; }
}

class FragileParcel extends Parcel implements Insurable {
    public FragileParcel(double w, double v) { super(w, v); }
    @Override double calculateCharge() { return (40 + (weight * 10)) + 50; }
    @Override public double getInsurance() { return declaredValue * 0.02; }
}

public class ParcelShippingDesk {

    public static void main(String[] args) {
        String[] types = {"STANDARD", "EXPRESS", "FRAGILE"};
        List<Parcel> parcels = new ArrayList<>();
        parcels.add(new StandardParcel(3, 500));
        parcels.add(new ExpressParcel(2, 1000));
        parcels.add(new FragileParcel(4, 2000));
        double grandTotal = 0;
        for (int i = 0; i < parcels.size(); i++) {
            Parcel p = parcels.get(i);
            double charge = p.calculateCharge();
            double insurance = (p instanceof Insurable) ? ((Insurable) p).getInsurance() : 0;
            double total = charge + insurance;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n", types[i], charge, insurance, total);
            grandTotal += total;
        }
        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}
