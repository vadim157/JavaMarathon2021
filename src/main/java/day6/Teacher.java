package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        String gradeString = null;

        int grade = random.nextInt(4) + 2;
        switch (grade) {
            case 2:
                gradeString = "неудовлетворительно";
                break;
            case 3:
                gradeString = "удовлетворительно";
                break;
            case 4:
                gradeString = "хорошо";
                break;
            case 5:
                gradeString = "отлично";
                break;

        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + gradeString);
    }
}
