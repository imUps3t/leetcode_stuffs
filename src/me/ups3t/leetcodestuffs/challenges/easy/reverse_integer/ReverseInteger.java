package me.ups3t.leetcodestuffs.challenges.easy.reverse_integer;

public class ReverseInteger {

    public int reverse(int x) {
        try {
            String stringver = Integer.toString(x);
            String[] strings = stringver.split("");

            String reverse = "";
            for (int j = strings.length - 1; j > -1; j--) {
                if (!strings[j].equals("-")) {
                    reverse += strings[j];
                }
            }

            if (strings[0].equals("-")) reverse = "-" + reverse;

            int result = Integer.parseInt(reverse);

            return (int) result;
        } catch (NumberFormatException ignored) {
            return 0;
        }
    }

    public static void main(String[] args) {
        ReverseInteger clazz = new ReverseInteger();

        System.out.println(Integer.toString(9646324351));
        System.out.println(clazz.reverse(1348919));
    }

}
