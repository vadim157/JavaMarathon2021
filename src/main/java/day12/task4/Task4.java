package day12.task4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members = new ArrayList<>(Arrays.asList("John", "Fred", "Alfred"));
        List<String> members2 = new ArrayList<>(Arrays.asList("Tony", "Tom", "Jason"));

        MusicBand metallica = new MusicBand("Metallica", 1981, members);
        MusicBand scooter = new MusicBand("Scooter", 1993, members2);

        System.out.println(metallica.getMembers());
        System.out.println(scooter.getMembers());
        System.out.println();
        MusicBand.transferMembers(metallica,scooter);
        System.out.println(metallica.getMembers());
        System.out.println(scooter.getMembers());

    }
}
