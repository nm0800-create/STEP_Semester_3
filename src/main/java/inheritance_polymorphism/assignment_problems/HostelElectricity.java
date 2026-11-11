package inheritance_polymorphism.assignment_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Room {
    protected int units;
    
    public Room(int units) {
        this.units = units;
    }
    
    abstract double calculateBill();
}

class SingleRoom extends Room {
    public SingleRoom(int u) { super(u); }
    @Override double calculateBill() { return units * 8; }
}

class SharedRoom extends Room {
    int occupants;
    public SharedRoom(int u, int occ) { super(u); occupants = occ; }
    @Override double calculateBill() { return (units * 6) / occupants; }
}

class ACRoom extends Room {
    public ACRoom(int u) { super(u); }
    @Override double calculateBill() { return (units * 10) + 200; }
}

public class HostelElectricity {

    public static void main(String[] args) {
        String[] types = {"SINGLE", "SHARED", "AC"};
        List<Room> rooms = new ArrayList<>();
        rooms.add(new SingleRoom(120));
        rooms.add(new SharedRoom(150, 3));
        rooms.add(new ACRoom(100));
        double total = 0;
        for (int i = 0; i < rooms.size(); i++) {
            double bill = rooms.get(i).calculateBill();
            System.out.printf("%s: %.2f%n", types[i], bill);
            total += bill;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
