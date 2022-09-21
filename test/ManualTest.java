package test;

import model.Student;
import model.Teacher;

public class ManualTest {

    public static void main(String[] args) {
        Teacher thirstyTeacher = new Teacher("Henk");
        Student coolStudent = new Student("Marcel");

        thirstyTeacher.wantsCoffee("regular", coolStudent);

    }

}
