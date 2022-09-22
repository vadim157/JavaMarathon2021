package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand metallica = new MusicBand("Metallica", 1981);
        MusicBand scooter = new MusicBand("Scooter", 1993);
        MusicBand bonJovi = new MusicBand("Bon Jovi", 1983);
        MusicBand linkinPark = new MusicBand("Linkin Park", 1996);
        MusicBand imagineDragon = new MusicBand("Imagine Dragon", 2008);
        MusicBand awolnation = new MusicBand("Awolnation", 2010);
        MusicBand theSubways = new MusicBand("The Subways", 2002);
        MusicBand cobraMan = new MusicBand("Cobra Man", 2017);
        MusicBand bingoPlayers = new MusicBand("Bingo Players", 2006);
        MusicBand danzig = new MusicBand("Danzig", 1987);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(metallica);
        musicBands.add(scooter);
        musicBands.add(bonJovi);
        musicBands.add(linkinPark);
        musicBands.add(imagineDragon);
        musicBands.add(awolnation);
        musicBands.add(theSubways);
        musicBands.add(cobraMan);
        musicBands.add(bingoPlayers);
        musicBands.add(danzig);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(Task3.groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newBands = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                newBands.add(band);
            }
        }
        return newBands;
    }
}
