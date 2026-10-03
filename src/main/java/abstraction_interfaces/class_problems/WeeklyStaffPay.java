package abstraction_interfaces.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class StaffMember {
    protected String name;
    
    public StaffMember(String name) {
        this.name = name;
    }
    
    abstract double calculatePay();
}

class FullTimeStaff extends StaffMember {
    double weeklySalary;
    public FullTimeStaff(String name, double salary) { 
        super(name); weeklySalary = salary; 
    }
    @Override double calculatePay() { return weeklySalary; }
}

class HourlyStaff extends StaffMember {
    double hours, rate;
    public HourlyStaff(String name, double h, double r) { 
        super(name); hours = h; rate = r; 
    }
    @Override double calculatePay() { 
        if (hours <= 40) return hours * rate;
        return (40 * rate) + ((hours - 40) * rate * 1.5);
    }
}

class Intern extends StaffMember {
    double stipend;
    public Intern(String name, double s) { super(name); stipend = s; }
    @Override double calculatePay() { return stipend; }
}

public class WeeklyStaffPay {
    public static void main(String[] args) {
        List<StaffMember> staff = new ArrayList<>();
        staff.add(new FullTimeStaff("Asha", 12000));
        staff.add(new HourlyStaff("Ravi", 45, 200));
        staff.add(new Intern("Neha", 5000));
        
        double total = 0;
        for (StaffMember s : staff) {
            double pay = s.calculatePay();
            System.out.printf("%s: %.2f%n", s.name, pay);
            total += pay;
        }
        System.out.printf("Total Payroll: %.2f%n", total);
    }
}
