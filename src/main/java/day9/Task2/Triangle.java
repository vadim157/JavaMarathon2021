package day9.Task2;

public class Triangle extends Figure {

    private int widthOne;
    private int widthTwo;
    private int widthThree;

    public Triangle(String color, int widthOne, int widthTwo, int widthThree) {
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
