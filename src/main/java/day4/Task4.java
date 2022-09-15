package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(arr));
        int num;
        int maxSumm = 0;
        int maxSummind = 0;
        for (int j = 0; j < arr.length - 2; j++) {
            num = arr[j] + arr[j + 1] + arr[j + 2];
            if (num > maxSumm) {
                maxSumm = num;
                maxSummind = j;

            }

        }

        System.out.println(maxSumm + " " + maxSummind);

    }
}
