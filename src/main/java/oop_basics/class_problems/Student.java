package oop_basics.class_problems;

public class Student {
    String name;
    int attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;
    
    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }
    
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.printf("Students created: %d%n", studentCount);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Student and College Information ===\n");
        
        new Student("Priya", 90);
        new Student("Arjun", 85);
        
        System.out.println("2 Student objects created\n");
        Student.printCollegeInfo();
    }
}
