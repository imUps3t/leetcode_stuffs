package me.ups3t.leetcodestuffs.challenges.easy.single_number;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }

            if(count == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String test = "testing REMOVE THIS testing";

        test = test.substring(8, 18);

        System.out.println(test);
    }

}
