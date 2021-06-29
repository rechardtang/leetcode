package com.cn.leetcode;

/**
 * 50. Pow(x, n)
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 2.00000, n = 10
 * 输出：1024.00000
 * 示例 2：
 * <p>
 * 输入：x = 2.10000, n = 3
 * 输出：9.26100
 * 示例 3：
 * <p>
 * 输入：x = 2.00000, n = -2
 * 输出：0.25000
 * 解释：2-2 = 1/22 = 1/4 = 0.25
 * <p>
 * <p>
 * 提示：
 * <p>
 * -100.0 < x < 100.0
 * -231 <= n <= 231-1
 * -104 <= xn <= 104
 */
public class A0050_myPow {

    public double myPow(double x, int n) {
        return n >= 0 ? pow(x, n) : pow(1 / x, -n);
    }

    private double pow(double x, int n) {
        if (n == 0) return 1;
        double y = pow(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }
}
