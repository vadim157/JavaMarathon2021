package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Rich", "Geography");
        Student student = new Student("John");
        teacher.evaluate(student);
    }
}

