package me.ups3t.leetcodestuffs.challenges.easy.assign_cookies;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0) return 0;

        int possibleContent = g.length;
        int content = 0;
        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < s.length; j++) {

                if(g[i] > s[j]) {
                    s[j] = g[i] - s[j];
                    content++;
                } else {
                    possibleContent--;
                }

                if(content >= possibleContent) return content;

            }
        }

        return content;
    }

}
