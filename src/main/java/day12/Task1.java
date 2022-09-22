package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(Arrays.asList("BMW", "Porsche", "Audi", "Lexus", "Mercedes"));
        cars.add(3, "Masereti");
        cars.remove(0);
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
