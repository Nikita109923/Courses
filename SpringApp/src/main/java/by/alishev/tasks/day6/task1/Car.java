package by.alishev.tasks.day6.task1;

public class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void writsText1() {
        System.out.println("It's car");
    }

    public int calculatesYear1(int someYear) {
        return Math.abs(someYear - year);

    }
}