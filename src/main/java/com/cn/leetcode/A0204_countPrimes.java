package com.cn.leetcode;

import com.cn.leetcode.internal.ListNode;

/**
 * 204. 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 示例 2：
 * <p>
 * 输入：n = 0
 * 输出：0
 * 示例 3：
 * <p>
 * 输入：n = 1
 * 输出：0
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= n <= 5 * 10^6
 */
public class A0204_countPrimes {

    public int countPrimes(int n) {
        int k = 0 ;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                k++;
            }
        }
        return k;
    }

    public boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
