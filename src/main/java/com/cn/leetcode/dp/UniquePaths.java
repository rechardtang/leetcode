package com.cn.leetcode.dp;

public class UniquePaths {
    public int uniquePathsR(int m, int n) {
        if (m == 1 || n == 1) return 1;
        return uniquePathsR(m - 1, n) + uniquePathsR(m, n - 1);
    }

    public int uniquePathsDP(int m, int n) {
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    res[0][j] = 1;
                } else if (j == 0) {
                    res[i][0] = 1;
                } else {
                    res[i][j] = res[i - 1][j] + res[i][j - 1];
                }
            }
        }
        return res[m - 1][n - 1];
    }

    public static void main(String[] args) {
        UniquePaths u = new UniquePaths();
        System.out.println(u.uniquePathsR(1, 1));
        System.out.println(u.uniquePathsR(3, 7));
        System.out.println("=============================");
        System.out.println(u.uniquePathsDP(1, 1));
        System.out.println(u.uniquePathsDP(3, 7));
    }
}
