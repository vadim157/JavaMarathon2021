package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Task2.add(numbers, 0, 30);
        Task2.add(numbers,300,350);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static List<Integer> add(List<Integer> list, int from, int before) {
        for (int i = from; i < before + 1; i++) {
            if (i % 2 == 0 && (i >= from && i <= before)) {
                list.add(i);
            }
        }
        return list;
    }
}
