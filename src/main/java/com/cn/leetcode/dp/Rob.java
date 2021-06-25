package com.cn.leetcode.dp;

public class Rob {

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

    public static void main(String[] args) {
        Rob r = new Rob();
        System.out.println(r.robR(new int[]{1, 2}));
        System.out.println(r.robR(new int[]{2, 1, 1, 2}));
        System.out.println(r.robR(new int[]{1, 2, 3, 1}));
        System.out.println(r.robR(new int[]{2, 7, 9, 3, 1}));
        System.out.println("==================================D");
        System.out.println(r.robD(new int[]{1, 2}));
        System.out.println(r.robD(new int[]{2, 1, 1, 2}));
        System.out.println(r.robD(new int[]{1, 2, 3, 1}));
        System.out.println(r.robD(new int[]{2, 7, 9, 3, 1}));
    }
}
