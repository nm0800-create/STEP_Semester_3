package inheritance_polymorphism.class_problems;

import java.util.ArrayList;
import java.util.List;

abstract class Question {
    protected String text;
    protected String correctAnswer;
    protected String studentAnswer;
    protected int points;
    
    public Question(String text, String correct, String student, int points) {
        this.text = text;
        this.correctAnswer = correct;
        this.studentAnswer = student;
        this.points = points;
    }
    
    abstract double calculateScore();
}

class MCQ extends Question {
    public MCQ(String t, String c, String s, int p) { super(t, c, s, p); }
    @Override double calculateScore() { return correctAnswer.equalsIgnoreCase(studentAnswer) ? points : 0; }
}

class TrueFalse extends Question {
    public TrueFalse(String t, String c, String s, int p) { super(t, c, s, p); }
    @Override double calculateScore() { return correctAnswer.equalsIgnoreCase(studentAnswer) ? points : 0; }
}

class Essay extends Question {
    public Essay(String t, String c, String s, int p) { super(t, c, s, p); }
    @Override double calculateScore() {
        String[] keywords = correctAnswer.split(",");
        int count = 0;
        for (String kw : keywords) {
            if (studentAnswer.toLowerCase().contains(kw.trim().toLowerCase())) count++;
        }
        if (count >= 2) return points * 0.75;
        if (count >= 1) return points * 0.50;
        return 0;
    }
}

public class ExamGrader {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new MCQ("What is capital?", "Paris", "Paris", 10));
        questions.add(new TrueFalse("Earth is flat?", "False", "True", 5));
        questions.add(new Essay("Name OOP principles", "Inheritance, Polymorphism, Encapsulation", "Polymorphism is one.", 20));
        questions.add(new Essay("Describe abstraction", "Abstraction, Composition", "I talked about abstraction.", 15));
        
        double total = 0;
        for (Question q : questions) {
            double score = q.calculateScore();
            System.out.printf("%.2f%n", score);
            total += score;
        }
        System.out.printf("Total Score: %.2f%n", total);
    }
}
