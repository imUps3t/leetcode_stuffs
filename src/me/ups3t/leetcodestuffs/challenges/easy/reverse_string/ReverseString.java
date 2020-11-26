package me.ups3t.leetcodestuffs.challenges.easy.reverse_string;

public class ReverseString {

    public void reverseString(char[] s) {
        int j = 0;
        for(int i = s.length-1; i > -1; i--) {
            System.out.println("i=" + i);
            System.out.println("j=" + j);
            j++;
        }
    }

    public static void main(String[] args) {
        ReverseString string = new ReverseString();
        char[] t = new char[] {'h', 'e', 'l', 'l', 'o'};
        string.reverseString(t);

        System.out.println(String.valueOf(t));
    }

}
