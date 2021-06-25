package com.cn.leetcode;

import java.util.*;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 * <p>
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 */
public class A0017_letterCombinations {

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

}
