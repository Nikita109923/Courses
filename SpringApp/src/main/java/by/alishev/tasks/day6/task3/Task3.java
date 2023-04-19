package by.alishev.tasks.day6.task3;

public class Task3 {
    public static void main(String[] args) {
        Airplane airplane =new Airplane("Pan",2012,40,40000 );

        airplane.setYear(2013);
        airplane.setLength(35);

        airplane.fillUp(1000);
        airplane.fillUp(2000);

        airplane.info();

    }
}
