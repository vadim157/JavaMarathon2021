package day12.task5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members = new ArrayList<>(Arrays.asList(new MusicArtist("John", 30), new MusicArtist("Tony", 35)));
        List<MusicArtist> members2 = new ArrayList<>(Arrays.asList(new MusicArtist("Alfred", 30), new MusicArtist("Ben", 35)));

        MusicBand metallica = new MusicBand("Metallica", 1981, members);
        MusicBand scooter = new MusicBand("Scooter", 1993, members2);

        System.out.println(metallica.getMembers());
        System.out.println(scooter.getMembers());

        MusicBand.transferMembers(metallica,scooter);

        System.out.println(metallica.getMembers());
        System.out.println(scooter.getMembers());

    }
}
