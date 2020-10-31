package me.ups3t.leetcodestuffs.challenges.medium.broken_calculator;

public class BrokenCalculator {

    public int brokenCalc(int X, int Y) {

        if(X >= Y) return X - Y;
        int ans = 0;

        while(Y>X) {
            if(Y%2==0) Y = Y/2;
            else Y = Y+1;
            ans++;
            System.out.println(Y);
        }

        return ans + (X-Y);
    }

    public static void main(String[] args) {
        System.out.println(new BrokenCalculator().brokenCalc(2, 3));
    }

}
