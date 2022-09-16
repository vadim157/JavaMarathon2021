package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Black");
        car.setYear(2015);
        System.out.println("Модель: " + car.getModel() + "," + " Цвет: " + car.getColor() + "," + " Год выпуска: " + car.getYear());
    }
}
