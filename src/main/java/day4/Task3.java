package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int[][] arrays = new int[12][5];
        System.out.println(arrays.length);
        int[] max = new int[arrays.length];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(50);
            }
        }
        for (int c = 0; c < arrays.length; c++) {
            for (int t = 0; t < arrays[c].length; t++) {
                count += arrays[c][t];
                System.out.print(arrays[c][t] + " ");
            }
            max[c] = count;
            count = 0;
            System.out.println();
        }

        System.out.println(Arrays.toString(max));
///////////Находим максимальный индекс/////////////
//        int maximum = max[0];
//        int index = 0;
//        for (int x = 0; x < max.length; x++) {
//            int score = max[x];
//            if (maximum < score) {
//                maximum = score;
//                index = x;
//            }
//        }
//        System.out.println(index);

        int maximNum = 0;
        int maxIndex = 0;
        int arrEl = 0;
        for (int i = 0; i < max.length;i++){
            arrEl = max[i];
            if(maximNum<arrEl){
                maximNum = arrEl;
                maxIndex = i;
            }

        }
        System.out.println(maxIndex);

    }

}

