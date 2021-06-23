package com.example.greedy;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        return "";
    }

    public static void main(String[] args) {
        RemoveDuplicateLetters r = new RemoveDuplicateLetters();
        System.out.println(r.removeDuplicateLetters("bcabc").equals("abc"));
        System.out.println(r.removeDuplicateLetters("cbacdcbc").equals("acdb"));
    }
}
