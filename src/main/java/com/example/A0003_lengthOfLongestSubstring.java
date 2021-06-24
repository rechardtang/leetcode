package com.example;

import java.util.Arrays;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class A0003_lengthOfLongestSubstring {

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
}
