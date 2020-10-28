package me.ups3t.leetcodestuffs.challenges.easy.contains_duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,1};

        ContainsDuplicate duplicate = new ContainsDuplicate();
        System.out.println(duplicate.containsDuplicate(test)); // true (2 1's)
    }

}
