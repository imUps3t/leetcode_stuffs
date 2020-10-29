package me.ups3t.leetcodestuffs.challenges.easy.to_lowercase;

public class ToLowercase {

    public String toLowerCase(String str) {
        String copy = "";

        for(int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i)) && String.valueOf(str.charAt(i)).toUpperCase().equals(String.valueOf(str.charAt(i)))) {
                copy += String.valueOf((char) (str.charAt(i) + 32));
            } else {
                copy += String.valueOf(str.charAt(i));
            }
        }
        return copy;
    }

    public static void main(String[] args) {

        ToLowercase test = new ToLowercase();

        System.out.println(test.toLowerCase("THANKS FOR READING MY CODE <3"));
    }

}
