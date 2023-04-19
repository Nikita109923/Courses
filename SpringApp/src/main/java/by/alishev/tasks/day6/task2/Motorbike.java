package by.alishev.tasks.day6.task2;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike() {
    }

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void writsText2 (){
        System.out.println("It's motorbike");
    }
    public int calculatesYear2(int someYear){
        return  Math.abs( someYear-year);
    }
}
