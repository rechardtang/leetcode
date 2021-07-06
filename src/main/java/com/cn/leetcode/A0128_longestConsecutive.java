package com.cn.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 128. 最长连续序列
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * <p>
 * <p>
 * <p>
 * 进阶：你可以设计并实现时间复杂度为 O(n) 的解决方案吗？
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 * <p>
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 */
public class A0128_longestConsecutive {

    interface Problem {

        int longestConsecutive(int[] nums);
    }

    static class BruteForceSolution implements Problem {

        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            int result = 1;
            for (int i = 0; i < nums.length; i++) {
                int current = nums[i];
                int length = 1;
                while (contains(nums, ++current)) {
                    length++;
                }
                result = Math.max(result, length);
            }
            return result;
        }

        private boolean contains(int[] nums, int next) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == next) return true;
            }
            return false;
        }
    }

    static class HashSetSolution implements Problem {

        @Override
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            int result = 1;
            for (int num : nums) {
                if (!set.contains(num - 1)) {
                    int length = 1;
                    while (set.contains(++num)) {
                        length++;
                    }
                    result = Math.max(result, length);
                }
            }
            return result;
        }
    }

    static class SortingSolution implements Problem {

        @Override
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            if (nums.length == 1) return 1;
            Arrays.sort(nums);

            // 1 1 1 2 3 5 6 7 8
            int result = 1;
            int length = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    continue;
                } else if (nums[i] + 1 == nums[i + 1]) {
                    result = Math.max(result, ++length);
                } else {
                    length = 1;
                }
            }
            return result;
        }
    }
}
