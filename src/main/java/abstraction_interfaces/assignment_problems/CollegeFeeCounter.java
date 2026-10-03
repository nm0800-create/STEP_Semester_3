package abstraction_interfaces.assignment_problems;

import java.util.ArrayList;
import java.util.List;

interface BusUser {
    boolean usesBus();
}

abstract class Student {
    protected String name;
    static final double TUITION = 40000;
    static final double BUS_FEE = 12000;
    
    public Student(String name) {
        this.name = name;
    }
    
    abstract double calculateFee();
}

class DayScholar extends Student implements BusUser {
    public DayScholar(String name) { super(name); }
    @Override double calculateFee() { return TUITION + BUS_FEE; }
    @Override public boolean usesBus() { return true; }
}

class Hosteller extends Student {
    public Hosteller(String name) { super(name); }
    @Override double calculateFee() { return TUITION + 60000; }
}

class ScholarStudent extends Student implements BusUser {
    public ScholarStudent(String name) { super(name); }
    @Override double calculateFee() { return (TUITION / 2) + BUS_FEE; }
    @Override public boolean usesBus() { return true; }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new DayScholar("Asha"));
        students.add(new Hosteller("Ravi"));
        students.add(new ScholarStudent("Neha"));
        
        double total = 0;
        for (Student s : students) {
            double fee = s.calculateFee();
            System.out.printf("%s: %.2f%n", s.name, fee);
            total += fee;
        }
        System.out.printf("Total Collected: %.2f%n", total);
    }
}
