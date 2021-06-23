package com.example.dp;

public class ClimbStairs {
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
        ClimbStairs c = new ClimbStairs();
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
