package com.example.string;

public class LongestCommonPrefix {

    public String longestCommonPrefixN2(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char temp = 0;
            for (int j = 0; j < strs.length; j++) {
                char c = strs[j].charAt(i);
                if (temp != 0 && c != temp) {
                    return sb.toString();
                } else {
                    temp = c;
                }
            }
            sb.append(temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(prefix.longestCommonPrefixN2(strs));
        ;
    }
}
