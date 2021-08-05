package com.cn.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1：
 * <p>
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 * [7],
 * [2,2,3]
 * ]
 * 示例 2：
 * <p>
 * 输入：candidates = [2,3,5], target = 8,
 * 所求解集为：
 * [
 * [2,2,2,2],
 * [2,3,3],
 * [3,5]
 * ]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * candidate 中的每个元素都是独一无二的。
 * 1 <= target <= 500
 */
public class A0039_combinationSum {

    interface Solution {
        List<List<Integer>> combinationSum(int[] candidates, int target);
    }

    static class DfsSolution implements Solution {

        @Override
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            int n = candidates.length;
            List<List<Integer>> result = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            for (int i = n; i > 0; i--) {
                stack.push(i - 1);
            }
            int sum = 0;
            List<Integer> path = new ArrayList<>();
            while (!stack.isEmpty()) {
                Integer popped = stack.pop();
                int value = candidates[popped];
//                System.out.println(value);
                path.add(value);
                sum += value;
                if (sum > target) {
                    System.out.println(path);
                    path.remove(path.size() - 1);
                    sum -= value;
                    continue;
                }
                if (sum == target) {
                    System.out.println(path);
                    result.add(new ArrayList<>(path));
                    path.remove(path.size() - 1);
                    sum -= value;
                }
                for (int i = n; i > popped; i--) {
                    stack.push(i - 1);
                }
            }
            return result;
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(combine));
            return;
        }
        // 直接跳过
        dfs(candidates, target, ans, combine, idx + 1);
        // 选择当前数
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }

}
