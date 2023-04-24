package by.alishev.tasks.day9.task2;

public class Circle extends Figure{
    private double r;
    public Circle(double r , String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
