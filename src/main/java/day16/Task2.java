package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        PrintWriter printWriter = new PrintWriter(file1);
        PrintWriter printWriter1 = new PrintWriter(file2);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            printWriter.printf(random.nextInt(100) + 1 + " ");
        }
        printWriter.close();
        Scanner scanner = new Scanner(file1);
        int count = 0;
        double sum = 0;
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            count++;
            if (count == 20) {
                printWriter1.print(sum / 20 + " ");
                count = 0;
                sum = 0;
            }
        }
        printWriter1.close();
        scanner.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        int count = 0;
        while (scanner.hasNext()) {
            sum += Double.parseDouble(scanner.next());
            count++;
        }
        System.out.println((int) sum);

    }
}
