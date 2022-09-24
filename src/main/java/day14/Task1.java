package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws InvalidInputFile, FileNotFoundException {
        File file = new File("text.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) throws FileNotFoundException, InvalidInputFile {
        int sum = 0;
        try (Scanner scanner = new Scanner(file)) {
            String nums = scanner.nextLine();
            String[] numbers = nums.split(" ");
            if (numbers.length > 10 || numbers.length < 10) {
                throw new InvalidInputFile("Некорректный входной файл");
            } else {
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден");
        }

    }
}
