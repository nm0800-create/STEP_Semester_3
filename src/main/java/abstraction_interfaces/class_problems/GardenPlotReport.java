package abstraction_interfaces.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Plot {
    protected String owner;
    
    public Plot(String owner) {
        this.owner = owner;
    }
    
    abstract double calculateArea();
}

class CirclePlot extends Plot {
    double radius;
    public CirclePlot(String owner, double radius) { 
        super(owner); this.radius = radius; 
    }
    @Override double calculateArea() { return Math.PI * radius * radius; }
}

class RectanglePlot extends Plot {
    double length, width;
    public RectanglePlot(String owner, double l, double w) { 
        super(owner); length = l; width = w; 
    }
    @Override double calculateArea() { return length * width; }
}

class TrianglePlot extends Plot {
    double base, height;
    public TrianglePlot(String owner, double b, double h) { 
        super(owner); base = b; height = h; 
    }
    @Override double calculateArea() { return 0.5 * base * height; }
}

public class GardenPlotReport {
    public static void main(String[] args) {
        List<Plot> plots = new ArrayList<>();
        plots.add(new CirclePlot("Asha", 5));
        plots.add(new RectanglePlot("Ravi", 4, 6));
        plots.add(new TrianglePlot("Neha", 10, 3));
        
        double total = 0;
        for (Plot p : plots) {
            double area = p.calculateArea();
            System.out.printf("%s: %.2f%n", p.owner.toUpperCase(), area);
            total += area;
        }
        System.out.printf("Total Area: %.2f%n", total);
    }
}
