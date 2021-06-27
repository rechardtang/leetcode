package com.cn.leetcode.dp;

public class MaxSubArray {
    public int maxSubArrayN2(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public int maxSubArrayN(int[] nums) {
        int size = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public int maxSubArrayP(int[] nums) {
        int pre = 0;
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            res = Math.max(res, pre);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxSubArray m = new MaxSubArray();
        System.out.println(m.maxSubArrayN2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(m.maxSubArrayN2(new int[]{1}));
        System.out.println(m.maxSubArrayN2(new int[]{0}));
        System.out.println(m.maxSubArrayN2(new int[]{-10000}));
        System.out.println("======================");
        System.out.println(m.maxSubArrayN(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(m.maxSubArrayN(new int[]{1}));
        System.out.println(m.maxSubArrayN(new int[]{0}));
        System.out.println(m.maxSubArrayN(new int[]{-10000}));
        System.out.println("======================");
        System.out.println(m.maxSubArrayP(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(m.maxSubArrayP(new int[]{1}));
        System.out.println(m.maxSubArrayP(new int[]{0}));
        System.out.println(m.maxSubArrayP(new int[]{-10000}));
    }
}
