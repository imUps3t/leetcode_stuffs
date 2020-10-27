package me.ups3t.leetcodestuffs.challenges.easy.move_zeros;

import java.util.Arrays;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int lastNonZero = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                System.out.println(i + "," + lastNonZero);
                int a = nums[lastNonZero];
                nums[lastNonZero++] = nums[i];
                nums[i] = a;
            }
        }
    }


    public static void main(String[] args) {

        int[] test = {1, 0, 2, 0, 3, 0, 0,0 };

        MoveZeros zeros = new MoveZeros();
        zeros.moveZeroes(test);

        System.out.println(Arrays.toString(test));

    }

}
