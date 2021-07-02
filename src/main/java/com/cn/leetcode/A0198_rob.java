package com.cn.leetcode;

/**
 * 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 *
 *
 * 示例 1：
 *
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2：
 *
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class A0198_rob {

    public int robR(int[] nums) {
        return maxRob(nums, nums.length - 1);
    }

    public int maxRob(int[] nums, int n) {
        if (n == 0) {
            return nums[0];
        }
        if (n == 1) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(maxRob(nums, n - 2) + nums[n], maxRob(nums, n - 1));
    }

    public int robD(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[0] = nums[0];
            } else if (i == 1) {
                res[1] = Math.max(nums[1], nums[0]);
            } else {
                res[i] = Math.max(res[i - 2] + nums[i], res[i - 1]);
            }
        }
        return res[nums.length - 1];
    }
}
