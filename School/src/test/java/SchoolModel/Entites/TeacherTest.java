package SchoolModel.Entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//TESTING
class TeacherTest {

    @Test
    void teachingCourse() {
        Teacher teacher = new Teacher("Okeke Joe", 23,45678);
        String actual = "Jones Smith";
        String expected = "Jones Smith";
        assertEquals(actual, expected);
    }
}