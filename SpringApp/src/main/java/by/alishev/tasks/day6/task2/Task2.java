package by.alishev.tasks.day6.task2;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2019, "Blue", "Kawasaki");
        System.out.println("Motorbike info : " + motorbike.getYear() + " - year," +
                motorbike.getColor() + " - color," +
                motorbike.getModel() + " - model." );
        motorbike.writsText2();
        System.out.println("Motorbike is " + motorbike.calculatesYear2(2023) + " year old");
    }
}