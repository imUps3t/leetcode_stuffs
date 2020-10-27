package me.ups3t.leetcodestuffs.extras.sorting_ints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingIntegers {

    public enum SortType {
        LEAST,
        GREATEST
    }

    public int[] sortIntegers1(SortType sortType, int[] array) {
        int[] arrCopy = array;

        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for(int i = 0; i < arrCopy.length-1; i++) {
                if(sortType == SortType.LEAST) {
                    if (arrCopy[i + 1] < arrCopy[i]) {
                        int temp = arrCopy[i];

                        arrCopy[i] = arrCopy[i + 1];
                        arrCopy[i + 1] = temp;
                        sorted = false;
                    }
                } else {
                    if (arrCopy[i + 1] > arrCopy[i]) {
                        int temp = arrCopy[i];

                        arrCopy[i] = arrCopy[i + 1];
                        arrCopy[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }

        return arrCopy;

    }

    public int[] sortIntegers2(SortType sortType, int[] array) {
        int[] arrCopy = array;

        for(int i = 0; i < arrCopy.length; i++) {
            for(int j = 0; j < arrCopy.length; j++) {
                if(sortType == SortType.LEAST) {
                    if (arrCopy[i] < arrCopy[j]) {
                        int temp = arrCopy[i];

                        arrCopy[i] = arrCopy[j];
                        arrCopy[j] = temp;
                    }
                } else {
                    if (arrCopy[i] > arrCopy[j]) {
                        int temp = arrCopy[i];

                        arrCopy[i] = arrCopy[j];
                        arrCopy[j] = temp;
                    }
                }
            }
        }

        return arrCopy;

    }

    public static void main(String[] args) throws InterruptedException {

        int[] array = new int[] {50, 100, 32, 495, 2849, 50, 100, 50, 100, 1278, 48, 389, 12, 490, 317};
        SortingIntegers test = new SortingIntegers();

        long currentTime = System.currentTimeMillis();

        int[] firstSort = test.sortIntegers1(SortType.LEAST, array);
        System.out.println(Arrays.toString(firstSort));
        double passed1 = (double) ((System.currentTimeMillis() - currentTime) / 1000F);
        currentTime = System.currentTimeMillis();
        int[] secondSort = test.sortIntegers2(SortType.GREATEST, array);
        System.out.println(Arrays.toString(secondSort));
        double passed2 = (double) ((System.currentTimeMillis() - currentTime) / 1000F);

        System.out.println("Time passed for 1st method: " + passed1 + "\nTime passed for 2nd method: " + passed2 + "\n");
        System.out.println(String.format("Are both equal? = %s", Arrays.hashCode(firstSort) == Arrays.hashCode(secondSort)));


    }

}
