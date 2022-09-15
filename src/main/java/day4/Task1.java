package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int [] test = {4, 8, 4, 9, 5, 2, 2, 3, 3, 6};
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        int count = 0;
        int countOne = 0;
        int even = 0;
        int notEven = 0;
        int sum = 0;


        for (int element : array) {
            System.out.print(element + " ");
            if (element > 8) {
                count++;
            }
            if (element == 1) {
                countOne++;
            }
            if (element % 2 == 0) {
                even++;
            }
            if (element % 2 != 0) {
                notEven++;
            }
            sum += element;
        }
        System.out.println();
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + count);
        System.out.println("Количество чисел равных 1: " + countOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + notEven);
        System.out.println("Сумма всех элементов массива: " + sum);
//


    }
}
