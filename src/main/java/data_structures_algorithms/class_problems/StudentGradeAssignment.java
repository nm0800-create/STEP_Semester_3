package data_structures_algorithms.class_problems;

public class StudentGradeAssignment {
    public static void main(String[] args) {
        System.out.println("Grade " + gradeFor(72));
        System.out.println("Grade " + gradeFor(95));
        System.out.println("Grade " + gradeFor(35));
    }

    static char gradeFor(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }
}
