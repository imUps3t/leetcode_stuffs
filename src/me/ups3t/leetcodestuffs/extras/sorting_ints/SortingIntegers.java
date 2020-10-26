package me.ups3t.leetcodestuffs.extras.sorting_ints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingIntegers {

    public int[] sortIntegers1(int[] array) {
        int[] arrCopy = array;

        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for(int i = 0; i < array.length-1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i];

                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }

        return arrCopy;

    }

    public int[] sortIntegers2(int[] array) {
        int[] arrCopy = array;

        for(int i = 0; i < arrCopy.length; i++) {
            for(int j = 0; j < arrCopy.length; j++) {
                if(arrCopy[i] < array[j]) {
                    int temp = array[i];

                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return arrCopy;

    }

    public static void main(String[] args) throws InterruptedException {

        int[] array = new int[] {50, 100, 32, 495, 2849, 50, 100, 50, 100, 1278, 48, 389, 12, 490, 317};
        SortingIntegers test = new SortingIntegers();

        long currentTime = System.currentTimeMillis();

        int[] firstSort = test.sortIntegers1(array);
        System.out.println(Arrays.toString(firstSort));
        double passed1 = ((double) System.currentTimeMillis() - (double) currentTime) / 1000F;
        currentTime = System.currentTimeMillis();
        int[] secondSort = test.sortIntegers2(array);
        System.out.println(Arrays.toString(secondSort));
        double passed2 = (System.currentTimeMillis() - currentTime) / 1000F;

        System.out.println("Time passed for 1st method: " + passed1 + "\nTime passed for 2nd method: " + passed2 + "\n");
        System.out.println(String.format("Are both equal? = %s", Arrays.hashCode(firstSort) == Arrays.hashCode(secondSort)));


    }

}
