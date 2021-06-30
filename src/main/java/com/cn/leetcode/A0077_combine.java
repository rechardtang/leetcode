package com.cn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */
public class A0077_combine {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), n, k, 1);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> path, int n, int k, int index) {
        if (k == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i <= n; i++) {
            path.add(i);
            dfs(result, path, n, k - 1, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
