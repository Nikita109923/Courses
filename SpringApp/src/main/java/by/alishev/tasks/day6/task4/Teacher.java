package by.alishev.tasks.day6.task4;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public Teacher() {
    }

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void getRating(Student student) {
        Random random = new Random();
        String description ="";
        int randomValue = random.nextInt(4) + 2;
        if (randomValue == 2) {
            description = "F";
        } else if (randomValue == 3) {
            description = "C";
        } else if (randomValue == 4) {
            description = "B";
        } else if (randomValue == 5) {
            description = "A";
        }
        System.out.println("Teacher " + this.fio + " evaluates a student " + student.getFio() +
                " in subject " + this.subject + " for evaluation " + description);
    }
}