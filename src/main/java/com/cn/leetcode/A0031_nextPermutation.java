package com.cn.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 31. 下一个排列
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须 原地 修改，只允许使用额外常数空间。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * 示例 3：
 * <p>
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * 示例 4：
 * <p>
 * 输入：nums = [1]
 * 输出：[1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 */
public class A0031_nextPermutation {

    public void nextPermutation(int[] nums) {
        int q = nums.length - 1;
        int k = q, p = q;
        for (int i = q; i > 0; --i) {
            if (nums[i - 1] < nums[i]) {
                k = i - 1;
                break;
            }
        }
        for (int i = q; i > k; --i) {
            if (nums[i] > nums[k]) {
                p = i;
                break;
            }
        }

        // swap k and p
        swap(nums, k, p);

        // reverse
        if (k == q) {
            reverse(nums, 0, q);
        } else {
            reverse(nums, k + 1, q);
        }
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int value = nums[i];
        nums[i] = nums[j];
        nums[j] = value;
    }
}
