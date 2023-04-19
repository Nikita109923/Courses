package by.alishev.tasks.day7.task1;


public class Task1 {
    public static void main(String[] args) {
       Airplane airplane1 = new Airplane("Pan",2012,40,40000 );
       Airplane airplane2 = new Airplane("Boeing",2012,40,40000 );
       Airplane.compareAirplanes(airplane1,airplane2);


    }
}
