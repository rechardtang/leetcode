package com.cn.leetcode;

import java.util.Arrays;

/**
 * 202. 快乐数
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」定义为：
 * <p>
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 true ；不是，则返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：19
 * 输出：true
 * 解释：
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 示例 2：
 * <p>
 * 输入：n = 2
 * 输出：false
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 2^31 - 1
 */
public class A0202_isHappy {

    public boolean isHappy(int n) {
        int[] nums = new int[10];
        int r, k = 0;
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            nums[k] = r;
            k++;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i] * nums[i];
        }
        if (sum == 1) return true;
        if (sum == 2 * 2) return false;
        if (sum == 3 * 3) return false;
        return isHappy(sum);
    }

}
