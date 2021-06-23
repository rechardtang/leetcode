package com.example.dp;

public class Rob2 {

    public int robD(int[] nums) {
        int[] res = new int[nums.length];
        if (nums.length == 1) {
            res[0] = nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                res[1] = Math.max(nums[1], nums[0]);
            } else if (i == 2) {
                res[2] = Math.max(nums[1], Math.max(nums[0], nums[2]));
            } else {
                res[i] = Math.max(res[i - 2] + nums[i], res[i - 1]);
            }
        }
        return res[nums.length - 1];
    }

    public static void main(String[] args) {
        Rob2 r = new Rob2();
        System.out.println(r.robD(new int[]{1, 2}));
        System.out.println(r.robD(new int[]{2, 1, 1, 2}));
        System.out.println(r.robD(new int[]{1, 2, 3, 1}));
        System.out.println(r.robD(new int[]{2, 7, 9, 3, 1}));
    }
}
