package me.ups3t.leetcodestuffs.extras.closest_to_zero;

import java.util.Arrays;

public class ClosestToZero {

    public int closestToZero(int[] arr) {

        if(arr.length == 0) return -1;
        if(arr.length == 1) return arr[0];

        int closest = Math.abs(arr[0]);

        for(int i = 0; i < arr.length; i++) {

            int temp = Math.abs(arr[i]);

            if(temp < closest) {

                closest = temp;
            }
        }

        return closest;
    }

    public static void main(String[] args) {

        int[] arr = {-100, -99, -3, -2, 1, 3, 5, 7, 100, 99};

        System.out.println(new ClosestToZero().closestToZero(arr));
    }
}
