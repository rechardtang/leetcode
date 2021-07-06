package com.cn.leetcode;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 46. 全排列
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 示例 2：
 * <p>
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 示例 3：
 * <p>
 * 输入：nums = [1]
 * 输出：[[1]]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数 互不相同
 */
public class A0046_permute {

    interface Problem {
        List<List<Integer>> permute(int[] nums);
    }

    static class CustomStackDfsSolution implements Problem {

        @Override
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            stack.push(null);
            boolean[] visited = new boolean[nums.length];
            while (!stack.isEmpty()) {
                Integer popped = stack.pop();
                visited[popped] = true;
                path.add(nums[popped]);
                for (int i = 0; i < nums.length; i++) {
                    if (!visited[i]) {
                        stack.push(i);
                    }
                }
            }
            return result;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), nums, new int[nums.length]);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> path, int[] nums, int[] visited) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            path.add(nums[i]);
            dfs(result, path, nums, visited);
            visited[i] = 0;
            path.remove(path.size() - 1);
        }
    }

}
