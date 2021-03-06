package com.cn.leetcode;

/**
 * 29. 两数相除
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * <p>
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * <p>
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
 * 示例 2:
 * <p>
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 解释: 7/-3 = truncate(-2.33333..) = -2
 * <p>
 * <p>
 * 提示：
 * <p>
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 */
public class A0029_divide {

    public int divide(int dividend, int divisor) {
        int sum = 0, counter = 0;
        boolean p1 = true, p2 = true;
        if (dividend < 0) {
            p1 = false;
            dividend = -dividend;
        }
        if (divisor < 0) {
            p2 = false;
            divisor = -divisor;
        }
        if (dividend == Integer.MIN_VALUE){
            dividend = Integer.MAX_VALUE;
        }
        else if (dividend == Integer.MAX_VALUE){
            dividend = Integer.MIN_VALUE;
        }
        if (divisor == Integer.MIN_VALUE){
            divisor = Integer.MAX_VALUE;
        }
        else if (divisor == Integer.MAX_VALUE){
            divisor = Integer.MIN_VALUE;
        }
        while (sum < dividend) {
            sum += divisor;
            if (sum == Integer.MAX_VALUE){
                System.out.println(Integer.MAX_VALUE);
            }
            if (sum > dividend) break;
            counter++;
        }
        if (!p1 && !p2) return counter;
        return (p1 && p2) ? counter : -counter;
    }

}
