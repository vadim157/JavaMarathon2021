package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        boolean flag = true;
        while (flag) {
            if (b == 0) {
//                flag = false;
                break;
            }
            System.out.println(a / b);
        }

    }
}
