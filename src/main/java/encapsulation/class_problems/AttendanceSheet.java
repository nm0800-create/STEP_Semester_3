package encapsulation.class_problems;

public class AttendanceSheet {
    private final String[] present;
    private int count;

    public AttendanceSheet(int maxStudents) {
        this.present = new String[maxStudents];
        this.count = 0;
    }

    public void markPresent(String name) {
        if (isPresent(name) || count >= present.length) return;
        present[count++] = name;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (present[i].equals(name)) return true;
        }
        return false;
    }

    public int getPresentCount() {
        return count;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println("count = " + sheet.getPresentCount());   // 2
        System.out.println(sheet.isPresent("Ben"));                 // true
        System.out.println(sheet.isPresent("Chen"));                // false
    }
}
