package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static day14.Task2.parseFileToStringList;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file){
        String string = null;
        List<Person> people = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                string = scanner.nextLine();
                String[] nameAndAge = string.split(" ");
                if (Integer.parseInt(nameAndAge[1]) < 0) {
                    throw new InvalidInputFile("Некорректный входной файл");
                }
                people.add(new Person(nameAndAge[0],Integer.parseInt(nameAndAge[1])));
            }
            return people;

        } catch (InvalidInputFile e){
            System.out.println("Некорректный входной файл");
            return new ArrayList<Person>();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return people;
    }
}
