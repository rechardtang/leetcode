package com.example.string;

import java.util.*;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return Collections.emptyList();
        }
        String[] table = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Queue<String> queue = new LinkedList<>();
        queue.add("");
        List<String> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            String removed = queue.remove();
            if (removed.length() != digits.length()) {
                String numberStr = String.valueOf(digits.charAt(removed.length()));
                int number = Integer.parseInt(numberStr);
                String s = table[number];
                for (int i = 0; i < s.length(); i++) {
                    queue.add(removed + s.charAt(i));
                }
            } else {
                list.add(removed);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        LetterCombinations combinations = new LetterCombinations();
        List<String> strings = combinations.letterCombinations("23");
        System.out.println(strings);
    }

}
