package me.ups3t.leetcodestuffs.challenges.easy.kids_with_candies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // first we find greatest amount of candy

        int maxCandy = 0;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > maxCandy) maxCandy = candies[i];
        }

        System.out.println(maxCandy);
        List<Boolean> bools = new ArrayList<>();

        for(int i = 0; i < candies.length; i++) {
            System.out.println("candies[i] + extra = " + (candies[i] + extraCandies));
            bools.add(candies[i] + extraCandies >= maxCandy);
        }

        return bools;
    }

    public static void main(String[] args) {

    }

}
