package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        boolean flag = true;
        while (flag) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b == 0) {
//                flag = false;
                break;
            }
            System.out.println(a / b);
        }

    }
}
