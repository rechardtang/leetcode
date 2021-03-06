package com.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：["()"]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 8
 */
public class A0022_generateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", 0, 0, n);
        return result;
    }

    private void dfs(List<String> result, String path, int left, int right, int n) {
        if (left == n && right == n) {
            result.add(path);
            return;
        }
        if (left != n) {
            dfs(result, path + "(", left + 1, right, n);
        }
        if (left > right) {
            dfs(result, path + ")", left, right + 1, n);
        }
    }


}
