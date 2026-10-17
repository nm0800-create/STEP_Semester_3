package encapsulation.assignment_problems;

public class TrafficLight {
    private static final String[] CYCLE = {"RED", "GREEN", "YELLOW"};
    private final String id;
    private int index;

    public TrafficLight(String id) {
        this.id = id;
        this.index = 0;
    }

    public String next() {
        index = (index + 1) % CYCLE.length;
        return CYCLE[index];
    }

    public String getColor() {
        return CYCLE[index];
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println(t.getColor());  // RED
        System.out.println(t.next());      // GREEN
        System.out.println(t.next());      // YELLOW
        System.out.println(t.next());      // RED
    }
}
