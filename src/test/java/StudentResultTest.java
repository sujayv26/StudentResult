import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentResultTest {

    @Test
    void testCalculateAverage() {
        StudentResult student = new StudentResult("Sujay");

        student.addMarks(80);
        student.addMarks(70);
        student.addMarks(90);

        assertEquals(80.0, student.calculateAverage());
    }

    @Test
    void testCalculateGrade() {
        StudentResult student = new StudentResult("Sujay");

        student.addMarks(90);
        student.addMarks(95);
        student.addMarks(90);

        assertEquals("A", student.calculateGrade());
    }

    @Test
    void testStudentPassed() {
        StudentResult student = new StudentResult("Sujay");

        student.addMarks(60);
        student.addMarks(70);
        student.addMarks(80);

        assertTrue(student.isPassed());
    }

    @Test
    void testInvalidMarks() {
        StudentResult student = new StudentResult("Sujay");

        assertThrows(
                IllegalArgumentException.class,
                () -> student.addMarks(110)
        );
    }
}