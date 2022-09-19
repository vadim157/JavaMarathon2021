package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle("Red", 10, 10, 10);
        Triangle triangle2 = new Triangle("Green", 10, 20, 30);
        Triangle triangle3 = new Triangle("Red", 10, 20, 15);
        Rectangle rectangle1 = new Rectangle("Red", 5, 10);
        Rectangle rectangle2 = new Rectangle("Orange", 40, 15);
        Circle circle1 = new Circle("Red", 4);
        Circle circle2 = new Circle("Red", 10);
        Circle circle3 = new Circle("Blue", 5);




        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)};

        System.out.println(TestFigures.calculateRedArea(figures));
        System.out.println(TestFigures.calculateRedPerimeter(figures));



    }

    public static double calculateRedPerimeter(Figure[] figures) {
        int sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        int sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.area();
            }
        }
        return sum;

    }


}

