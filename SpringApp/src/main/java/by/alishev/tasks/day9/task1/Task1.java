package by.alishev.tasks.day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Pol","43");
        Teacher teacher = new Teacher("Tom","economic");

        System.out.println("Students group : " + student.getGroupName());
        System.out.println("Teachers subject : " + teacher.getSubjectName());
        System.out.println();
        student.printInfo();
        System.out.println();
        teacher.printInfo();
    }
}