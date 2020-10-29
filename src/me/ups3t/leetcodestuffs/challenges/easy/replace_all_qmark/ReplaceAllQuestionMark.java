package me.ups3t.leetcodestuffs.challenges.easy.replace_all_qmark;

public class ReplaceAllQuestionMark {

    public String modifyString(String s) {
        char[] stringArray = s.toCharArray();

        int previous = 0;
        int next = 0;
        for(int i = 0; i < stringArray.length; i++) {
            if(stringArray[i] == '?') {
                for(int j = 97; j < 123; j++) {
                   previous = i == 0 ? 0 : i-1;
                   next = i == stringArray.length-1 ? stringArray.length-1 : i+1;
                    if (stringArray[i] != (char) j && stringArray[next] != (char) j && stringArray[previous] != (char) j) {
                        stringArray[i] = (char) j;
                        break;
                    }
                }
            }
        }

        return String.valueOf(stringArray);
    }

    public static void main(String[] args) {
        ReplaceAllQuestionMark test = new ReplaceAllQuestionMark();

        System.out.println(test.modifyString("love you ?ll <3"));
    }

}
