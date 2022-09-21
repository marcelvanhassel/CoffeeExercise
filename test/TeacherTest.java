package test;

import model.Cup;
import model.Student;
import model.Teacher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    Teacher thirstyTeacher;
    Student coolStudent;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        thirstyTeacher = new Teacher("Henk");
        coolStudent = new Student("Marcel");
    }

    @AfterEach
    void tearDown() {
        thirstyTeacher = null;
        coolStudent = null;
    }

    @Test
    public void testObjectISReturned() {
        assertNotNull(coolStudent.bringCoffee("Doesn't matter"));
    }

    @Test
    public void testIfReturnedObjectIsOfTypeCup() {
        Cup testCup = new Cup("pink");
        assertEquals(testCup.getClass(), coolStudent.bringCoffee("Black").getClass());
    }

    @Test
    public void testIfTwoCupsArePossible() {
        assertNotNull(coolStudent.bringCoffee("Black"));
        assertNotNull(coolStudent.bringCoffee("cappuccino"));
    }

    @Test
    public void testIfTwoCupsAreDifferent() {
        assertNotSame(coolStudent.bringCoffee("Black"), coolStudent.bringCoffee("Black"));
    }

    @Test
    public void waterGetsReduced() {
        int value1 = 50;
        coolStudent.bringCoffee("Black");
        int value2 = coolStudent.myCoffeeMachine.getWater().getAmount();
        assertNotEquals(value1, value2);
    }

}