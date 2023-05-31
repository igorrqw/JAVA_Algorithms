package JAVA_Algorithms.Homework1;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 1, 1, 2, 3, 4, 2, 1, 3};
        System.out.println(Arrays.toString(countSort(array)));
    }

    private static int[] countSort(int[] arr) {
        int[] resultArr = new int[10];
        for (int j = 0; j < resultArr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == j)
                    resultArr[j]++;                   
            }
        }

        int count = 0;
        for (int j = 0; j < resultArr.length; j++) {
            for (int i = 0; i < resultArr[j]; i++) {
                arr[count] = j;
                count++;
            }
        }
        return arr;
    }
}