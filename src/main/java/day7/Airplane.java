package day7;

public class Airplane {


    private String manufacturer;//(изготовитель)
    private int year; //(год выпуска)
    private int length; //(длина)
    private int weight; //(вес)
    private int fuel; //(количество топлива в баке)

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane a, Airplane b) {
        if (a.length > b.length) {
            System.out.println("Первый самолет длиннее");
        } else if (a.length < b.length) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }

    }
}
