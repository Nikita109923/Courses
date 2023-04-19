package by.alishev.tasks.day6.task4;

public class Task4 {
    public static void main(String[] args) {
        Student student = new Student("Ivanov Ivan Ivanovich");
        Teacher teacher = new Teacher("Petrov Petor Petrovich","Alhebra");
        teacher.getRating(student);
    }
}
