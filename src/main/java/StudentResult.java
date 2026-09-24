import java.util.ArrayList;
import java.util.List;

public class StudentResult {

    private String studentName;
    private List<Integer> marks;

    public StudentResult(String studentName) {
        this.studentName = studentName;
        this.marks = new ArrayList<>();
    }

    // Operation 1: Add marks for a subject
    public void addMarks(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }

        marks.add(mark);
    }

    // Operation 2: Calculate average marks
    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return (double) total / marks.size();
    }

    // Operation 3: Calculate grade
    public String calculateGrade() {
        double average = calculateAverage();

        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Operation 4: Check pass status
    public boolean isPassed() {
        return calculateAverage() >= 50;
    }

    public String getStudentName() {
        return studentName;
    }
}