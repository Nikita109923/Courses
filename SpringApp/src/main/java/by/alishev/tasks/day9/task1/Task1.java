package by.alishev.tasks.day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bil", "Math group");
        Teacher teacher = new Teacher("Tom","Math");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.getInfo();
        teacher.getInfo();
    }
}