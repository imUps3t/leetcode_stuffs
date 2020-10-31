package me.ups3t.leetcodestuffs.challenges.medium.broken_calculator;

public class BrokenCalculator {

    public int brokenCalc(int X, int Y) {

        if(X >= Y) return X - Y; // this works because if x is greater or equal than y you cannot double it, therefore it would just be subtracting x.
        int ans = 0; // this variable is for checking how many moves were made

        while(Y>X) { // as long as y is greater than x;
            if(Y%2==0) Y = Y/2; // if y is even divide by 2
            else Y = Y+1; // otherise add by 1
            ans++; // we just did 1 move
        }

        return ans + (X-Y); // x >= y again so now we can do the same thing we did at the top. we add them moves we made to how the amount of subtractions that would have been done.
    }

    public static void main(String[] args) {
        System.out.println(new BrokenCalculator().brokenCalc(20, 10));
    }

}
