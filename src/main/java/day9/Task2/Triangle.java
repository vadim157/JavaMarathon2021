package day9.Task2;

public class Triangle extends Figure {

    private double widthOne;
    private double widthTwo;
    private double widthThree;

    public Triangle(double widthOne, double widthTwo, double widthThree, String color) {
        super(color);
        this.widthOne = widthOne;
        this.widthTwo = widthTwo;
        this.widthThree = widthThree;
    }

    @Override
    public double area() {
        double p = (widthOne + widthTwo + widthThree) / 2;
        return Math.sqrt((p * (p - widthOne) * (p - widthTwo) * (p - widthThree)));

    }

    @Override
    public double perimeter() {
        return widthOne + widthTwo + widthThree;
    }
}
