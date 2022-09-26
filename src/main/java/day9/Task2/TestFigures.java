package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle( 10, 10, 10,"Red");
        Triangle triangle2 = new Triangle( 10, 20, 30,"Green");
        Triangle triangle3 = new Triangle( 10, 20, 15,"Red");
        Rectangle rectangle1 = new Rectangle( 5, 10,"Red");
        Rectangle rectangle2 = new Rectangle( 40, 15,"Orange");
        Circle circle1 = new Circle( 4,"Red");
        Circle circle2 = new Circle( 10,"Red");
        Circle circle3 = new Circle( 5,"Blue");




        Figure[] figures = {
                new Triangle( 10, 10, 10,"Red"),
                new Triangle( 10, 20, 30,"Green"),
                new Triangle( 10, 20, 15,"Red"),
                new Rectangle( 5, 10,"Red"),
                new Rectangle( 40, 15,"Orange"),
                new Circle(4,"Red"),
                new Circle(10,"Red"),
                new Circle(5,"Blue")};

        System.out.println(TestFigures.calculateRedArea(figures));
        System.out.println(TestFigures.calculateRedPerimeter(figures));



    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.area();
            }
        }
        return sum;

    }


}

