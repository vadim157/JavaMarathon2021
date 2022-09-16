package day6;



public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Black");
        car.setYear(2010);

       Motorbike motorbike = new Motorbike("Ducati","Red", 2010);

        System.out.println(car.yearDifference(2013));
        System.out.println(motorbike.yearDifference(2018));



    }
}
