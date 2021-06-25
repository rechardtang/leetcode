package com.cn.leetcode.dp;

public class IsSubsequence {
    public boolean isSubsequenceMN(String s, String t) {
        if (s.equals("")) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }
        int last = -1;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = last + 1; j < t.length(); j++) {
                if (t.charAt(j) == s.charAt(i)) {
                    last = j;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return last != -1;
    }

    public boolean isSubsequenceN(String s, String t) {
        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) j++;
        }
        return j == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence s = new IsSubsequence();
        System.out.println(s.isSubsequenceMN("abc", "ahbgdc"));
        System.out.println(s.isSubsequenceMN("", ""));
        System.out.println(s.isSubsequenceMN("", ""));
        System.out.println("===============================");
        System.out.println(s.isSubsequenceN("abc", "ahbgdc"));
        System.out.println(s.isSubsequenceN("", ""));
        System.out.println(s.isSubsequenceN("", ""));
    }

}
