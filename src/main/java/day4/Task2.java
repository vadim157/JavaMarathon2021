package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();
        int count = 0;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10000);
        }
        int max = 0;
        int min = 10000;
        for (int el : array) {
            if (el % 10 == 0) {
                count++;
                sum += el;
            }
            if(el > max){
                max = el;
            }
            if(el < min){
                min = el;
            }
        }

        boolean flag = false;
        int buf = 0;
        while (!flag){
            flag = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    buf = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buf;
                    flag = false;
                }
            }
        }


        System.out.println("наименьший элемент массива " + array[0]);
        System.out.println("наибольший элемент массива " + array[99]);
        System.out.println("наименьший элемент массива без сортировки " + min);
        System.out.println("наибольший элемент массива без сортировки " + max);
        System.out.println("количество элементов массива, оканчивающихся на 0 " + count);
        System.out.println("сумму элементов массива, оканчивающихся на 0 " + sum);

    }
}
