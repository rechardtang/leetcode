package com.example.string;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring1(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int length;
            boolean duplicate = false;
            for (int j = i; j < s.length(); j++) {
                for (int k = i; k < j; k++) {
                    if (s.charAt(j) == s.charAt(k)) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    length = j - i + 1;
                    max = Math.max(max, length);
                } else {
                    break;
                }
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < s.length(); j++) {
                if (visited[s.charAt(j)]) {
                    break;
                } else {
                    max = Math.max(max, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring3(String s) {
        int max = 0;
        // map
        int[] visited = new int[256];
        Arrays.fill(visited, -1);
        for (int left = 0, right = 0; right < s.length(); right++) {
            left = Math.max(left, visited[s.charAt(right)] + 1);
            max = Math.max(max, right - left + 1);
            visited[s.charAt(right)] = right;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "bbbbb";
        LongestSubstringWithoutRepeatingCharacters o = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(o.lengthOfLongestSubstring1(s));
        System.out.println(o.lengthOfLongestSubstring2(s));
        System.out.println(o.lengthOfLongestSubstring3(s));
    }
}
