package day8;

public class Task1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println("Start " + start);

        String string = String.valueOf(0);

        for (int i = 1; i <= 20_000; i++) {

            string = string + " " + i;

        }
        System.out.println(string);
        long stop = System.currentTimeMillis();
        System.out.println("Alltime String " + (stop - start));


        long start1 = System.currentTimeMillis();
        System.out.println("Start " + start);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= 20_000; i++) {

            stringBuilder.append(i).append(" ");

        }
        System.out.println(stringBuilder.toString());
        long stop1 = System.currentTimeMillis();
        System.out.println("Alltime StringBuldier" + (stop1 - start1));
        System.out.println();
        System.out.println("Alltime String " + (stop - start));
        System.out.println("Alltime StringBuldier " + (stop1 - start1));

    }
}
