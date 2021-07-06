package com.cn.leetcode;

import java.util.List;

/**
 * 45. 跳跃游戏 II
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * <p>
 * 假设你总是可以到达数组的最后一个位置。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 示例 2:
 * <p>
 * 输入: [2,3,0,1,4]
 * 输出: 2
 * <p>
 * <p>
 * 提示:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 105
 */
public class A0045_jump {

    interface Problem {
        int jump(int[] nums);
    }

    static class GreedySolution implements Problem {

        @Override
        public int jump(int[] nums) {
            int steps = 0;
            for (int i = 0, max = 0, end = 0; i < nums.length - 1; i++) {
                max = Math.max(max, i + nums[i]);
                if (i == end) {
                    end = max;
                    steps++;
                }
            }
            return steps;

        }
    }

    static class GreedyBackSolution implements Problem {

        @Override
        public int jump(int[] nums) {
            int n = nums.length;
            int position = n - 1;
            int steps = 0;
            while (position > 0) {
                for (int i = 0; i < position; i++) {
                    if (i + nums[i] >= position) {
                        position = i;
                        steps++;
                        break;
                    }
                }
            }
            return steps;
        }
    }

    static class DfsSolution implements Problem {

        @Override
        public int jump(int[] nums) {
            if (nums.length == 1) return 0;
            return dfs(nums, nums.length - 1, 0, 0, Integer.MAX_VALUE);
        }

        private int dfs(int[] nums, int remained, int index, int depth, int step) {
            if (remained <= 0) return depth;
            for (int i = index + 1, k = 1; i <= Math.min(index + nums[index], nums.length - 1); i++, k++) {
                if (remained - k <= 0)
                    System.out.printf("i = %d, ai[i] = %d, remained = %d, depth = %d, step = %d\n", index, nums[index], remained - k, depth, step);
                if (nums[i] == 0) continue;
                if (depth > step) continue;
                int d = dfs(nums, remained - k, i, depth + 1, step);
                step = Math.min(step, d);
            }
            return step;
        }
    }

}
