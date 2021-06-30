package com.cn.leetcode;

/**
 * 69. x 的平方根
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
public class A0069_mySqrt {

    // s[i] = s[i-1]+2i-1
    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l <= r) {
            int m = (l + r) / 2;
            if ((long) m * m > x) {
                r = m-1;
            } else if ((long) m * m < x) {
                l = m+1;
            } else {
                return m;
            }
        }
        return r;
    }
}
