package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Airbus",2020,73, 280);
        airplane.info();
        airplane.setYear(2018);
        airplane.setLength(75);
        airplane.fillUp(5);
        airplane.fillUp(7);
        airplane.info();

    }
}
