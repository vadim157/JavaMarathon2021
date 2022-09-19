package day9.Task2;

public class Circle extends Figure {

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    private int radius;

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
