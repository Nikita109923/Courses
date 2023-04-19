package by.alishev.tasks.day6.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("Black");
        car.setModel("Tesla Model");
        System.out.println("Car info : " + car.getYear() + " - year," +
                car.getColor() + " - color," +
                car.getModel() + " - model.");
        car.writsText1();
        System.out.println("Car is " + car.calculatesYear1(2000) + " year old");

    }
}
