package com.cn.leetcode;

import sun.jvm.hotspot.types.CIntegerField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 78. 子集
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * <p>
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 * <p>
 * 输入：nums = [0]
 * 输出：[[],[0]]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * nums 中的所有元素 互不相同
 */
public class A0078_subsets {

    interface Solution {
        List<List<Integer>> subsets(int[] nums);
    }

    static class MySolution implements Solution {

        @Override
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j <= nums.length; j++) {
                    res.addAll(subsets(nums, i, j));
                }
            }
            return res;
        }

        private List<List<Integer>> subsets(int[] nums, int start, int offset) {
            if (start + offset > nums.length) return Collections.emptyList();
            List<List<Integer>> res = new ArrayList<>();
            dfs(nums, res, new ArrayList<>(), start, offset);
            return res;
        }

        private void dfs(int[] nums, List<List<Integer>> res, List<Integer> path, int start, int depth) {
            if (depth == path.size()) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = start; i < nums.length; i++) {
                path.add(nums[i]);
                dfs(nums, res, path, i + 1, depth);
                path.remove(nums[i]);
            }
        }

    }
}
