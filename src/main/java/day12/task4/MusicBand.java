package day12.task4;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;

    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static MusicBand transferMembers(MusicBand a, MusicBand b) {
        b.getMembers().addAll(a.getMembers());
        a.getMembers().removeAll(a.getMembers());
        return b;
    }
}
