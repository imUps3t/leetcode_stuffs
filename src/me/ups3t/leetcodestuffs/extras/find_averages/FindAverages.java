package me.ups3t.leetcodestuffs.extras.find_averages;

import me.ups3t.leetcodestuffs.extras.sorting_ints.SortingIntegers;

import java.util.HashMap;
import java.util.Map;

public class FindAverages {

    private double findMedian(int[] list) {
        return list.length % 2 == 0 ? (double) ((list[(list.length / 2) - 1] + list[(list.length / 2)])) / 2 : list[(list.length / 2)];
    }

    private int findMode(int[] list) {
        int maxValue = 0;
        int maxCount = 0;

        for(int i = 0; i < list.length; i++) {
            int count = 0;
            for(int j = 0; j < list.length; j++) {
                if(list[j] == list[i]) count++;
            }

            if(count > maxCount) {
                maxCount = count;
                maxValue = list[i];
            }
        }
        return maxValue;
    }


    private int findMean(int[] list) {
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        return sum / list.length;
    }

    private int findRange(int[] list) {
        SortingIntegers integers = new SortingIntegers();
        int[] sort = integers.sortIntegers1(SortingIntegers.SortType.LEAST, list);
        return sort[list.length - 1] - sort[0];
    }

    public static void main(String[] args) {

        int[] test = {1, 1, 1, 2, 2, 2,2, 2};
        FindAverages averages = new FindAverages();

        System.out.println("(length=" + test.length + ")");

        System.out.println("Mean: " + averages.findMean(test));
        System.out.println("Median: " + averages.findMedian(test));
        System.out.println("Mode: " + averages.findMode(test));
        System.out.println("Range: " + averages.findRange(test));
    }
}
