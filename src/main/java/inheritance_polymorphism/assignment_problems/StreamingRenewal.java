package inheritance_polymorphism.assignment_problems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class SubscriptionPlan {
    protected String name;
    protected LocalDate startDate;
    
    public SubscriptionPlan(String name, String dateStr) {
        this.name = name;
        this.startDate = LocalDate.parse(dateStr);
    }
    
    abstract int getValidityDays();
    
    LocalDate getRenewalDate() {
        return startDate.plusDays(getValidityDays());
    }
}

class BasicPlan extends SubscriptionPlan {
    public BasicPlan(String n, String d) { super(n, d); }
    @Override int getValidityDays() { return 30; }
}

class StandardPlan extends SubscriptionPlan {
    public StandardPlan(String n, String d) { super(n, d); }
    @Override int getValidityDays() { return 90; }
}

class PremiumPlan extends SubscriptionPlan {
    public PremiumPlan(String n, String d) { super(n, d); }
    @Override int getValidityDays() { return 365; }
}

public class StreamingRenewal {
    public static void main(String[] args) {
        List<SubscriptionPlan> subs = new ArrayList<>();
        subs.add(new BasicPlan("Asha", "2024-01-15"));
        subs.add(new StandardPlan("Ravi", "2024-02-01"));
        subs.add(new PremiumPlan("Neha", "2024-03-10"));
        subs.add(new BasicPlan("Kiran", "2024-12-20"));
        
        for (SubscriptionPlan s : subs) {
            System.out.println(s.name + ": " + s.getRenewalDate());
        }
    }
}
