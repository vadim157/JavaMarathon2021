package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("src/main/resources/shoes.csv"));
             PrintWriter printWriter = new PrintWriter(new File("src/main/resources/missing_shoes.txt"))) {
            while (scanner.hasNextLine()) {
                String remains = scanner.nextLine();
                if (remains.length() > 1) {
                    String[] rameinsArr = remains.split(";");
                    if (Integer.parseInt(rameinsArr[2]) == 0) {
                        printWriter.println(rameinsArr[0] + ", " + rameinsArr[1] + ", " + rameinsArr[2]);
                    }
                } else {
                    System.out.println("Нет нулевых позиций");
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Не корректный входной файл");
        }

    }
}
