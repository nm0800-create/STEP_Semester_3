package abstraction_interfaces.assignment_problems;

import java.util.ArrayList;
import java.util.List;

interface SaverMode {
    double applySaverMode(double units);
}

abstract class Appliance {
    protected String name;
    protected int power, hours;
    static final double COST_PER_UNIT = 8;
    
    public Appliance(String name, int power, int hours) {
        this.name = name;
        this.power = power;
        this.hours = hours;
    }
    
    double calculateUnits() {
        return (power * hours) / 1000.0;
    }
    
    double calculateCost(double units) {
        return units * COST_PER_UNIT;
    }
}

class Fridge extends Appliance {
    public Fridge(int hours) { super("FRIDGE", 150, hours); }
}

class AC extends Appliance implements SaverMode {
    public AC(int hours) { super("AC", 1500, hours); }
    @Override public double applySaverMode(double units) { return units * 0.75; }
}

class TV extends Appliance {
    public TV(int hours) { super("TV", 100, hours); }
}

class Washer extends Appliance implements SaverMode {
    public Washer(int hours) { super("WASHER", 500, hours); }
    @Override public double applySaverMode(double units) { return units * 0.75; }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        List<Object[]> appliances = new ArrayList<>();
        appliances.add(new Object[]{new Fridge(24), false});
        appliances.add(new Object[]{new AC(8), true});
        appliances.add(new Object[]{new TV(5), false});
        appliances.add(new Object[]{new Washer(2), true});
        
        double total = 0;
        for (Object[] item : appliances) {
            Appliance app = (Appliance) item[0];
            boolean saver = (boolean) item[1];
            
            if (saver && !(app instanceof SaverMode)) {
                System.out.println(app.name + ": saver mode not supported");
            } else {
                double units = app.calculateUnits();
                if (saver && app instanceof SaverMode) {
                    units = ((SaverMode)app).applySaverMode(units);
                }
                double cost = app.calculateCost(units);
                System.out.printf("%s: Units=%.2f Cost=%.2f%n", app.name, units, cost);
                total += cost;
            }
        }
        System.out.printf("Total Cost: %.2f%n", total);
    }
}
