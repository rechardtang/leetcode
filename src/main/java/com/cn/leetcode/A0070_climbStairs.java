package com.cn.leetcode;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
public class A0070_climbStairs {
    public int climbStairsR(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairsR(n - 1) + climbStairsR(n - 2);
    }

    public int climbStairsD(int n) {
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    public static void main(String[] args) {
        A0070_climbStairs c = new A0070_climbStairs();
        System.out.println(c.climbStairsR(1));
        System.out.println(c.climbStairsR(2));
        System.out.println(c.climbStairsR(3));
        System.out.println(c.climbStairsR(4));
        System.out.println(c.climbStairsR(5));
        System.out.println("===================");
        System.out.println(c.climbStairsD(1));
        System.out.println(c.climbStairsD(2));
        System.out.println(c.climbStairsD(3));
        System.out.println(c.climbStairsD(4));
        System.out.println(c.climbStairsD(5));
    }
}
