package abstraction_interfaces.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Connection {
    protected int units;
    
    public Connection(int units) {
        this.units = units;
    }
    
    abstract double calculateBill();
}

class HomeConnection extends Connection {
    public HomeConnection(int u) { super(u); }
    @Override double calculateBill() {
        if (units <= 100) return units * 5;
        return (100 * 5) + ((units - 100) * 7);
    }
}

class ShopConnection extends Connection {
    public ShopConnection(int u) { super(u); }
    @Override double calculateBill() { return (units * 8) + 100; }
}

class FactoryConnection extends Connection {
    public FactoryConnection(int u) { super(u); }
    @Override double calculateBill() { return Math.max(units * 6, 1000); }
}

public class ElectricityBilling {
    public static void main(String[] args) {
        List<Connection> connections = new ArrayList<>();
        connections.add(new HomeConnection(150));
        connections.add(new ShopConnection(90));
        connections.add(new FactoryConnection(120));
        
        double total = 0;
        for (Connection c : connections) {
            double bill = c.calculateBill();
            System.out.printf("%.2f%n", bill);
            total += bill;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
