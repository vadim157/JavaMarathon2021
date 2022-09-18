package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2020, 74, 280000);
        Airplane airplane1 = new Airplane("Airbus", 2021, 73, 280000);
        Airplane.compareAirplanes(airplane, airplane1);

    }
}