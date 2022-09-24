package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));


    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        String string = null;
        List<String> people = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                string = scanner.nextLine();
                String[] nameAndAge = string.split(" ");
                if (Integer.parseInt(nameAndAge[1]) < 0) {
                    throw new InvalidInputFile("Некорректный входной файл");
                }
                people.add(string);
            }
            return people;

        } catch (InvalidInputFile e){
            System.out.println("Некорректный входной файл");
            return new ArrayList<String>();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return people;
    }
}
