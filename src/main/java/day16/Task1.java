package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        printResult(file);

    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            double count = 0;
            double summ = 0;
            while (scanner.hasNextDouble()) {
                summ += scanner.nextDouble();
                count++;
            }
            System.out.print(summ / count + " --> ");
            System.out.printf("%.3f", summ / count);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            ;
        }

    }
}

