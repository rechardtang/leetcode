package com.cn.leetcode;

/**
 * 1833. 雪糕的最大数量
 * 夏日炎炎，小男孩 Tony 想买一些雪糕消消暑。
 * <p>
 * 商店中新到 n 支雪糕，用长度为 n 的数组 costs 表示雪糕的定价，其中 costs[i] 表示第 i 支雪糕的现金价格。Tony 一共有 coins 现金可以用于消费，他想要买尽可能多的雪糕。
 * <p>
 * 给你价格数组 costs 和现金量 coins ，请你计算并返回 Tony 用 coins 现金能够买到的雪糕的 最大数量 。
 * <p>
 * 注意：Tony 可以按任意顺序购买雪糕。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：costs = [1,3,2,4,1], coins = 7
 * 输出：4
 * 解释：Tony 可以买下标为 0、1、2、4 的雪糕，总价为 1 + 3 + 2 + 1 = 7
 * 示例 2：
 * <p>
 * 输入：costs = [10,6,8,7,7,8], coins = 5
 * 输出：0
 * 解释：Tony 没有足够的钱买任何一支雪糕。
 * 示例 3：
 * <p>
 * 输入：costs = [1,6,3,1,2,5], coins = 20
 * 输出：6
 * 解释：Tony 可以买下所有的雪糕，总价为 1 + 6 + 3 + 1 + 2 + 5 = 18 。
 */
public class A1833_maxIceCream {

    public int max = 0;

    public int maxIceCream(int[] costs, int coins) {
        dfs(costs, coins, 0, 0);
        return max;
    }

    private void dfs(int[] costs, int coins, int index, int depth) {
        if (depth == costs.length && coins == 0) max = costs.length;
        if (depth == costs.length && coins > 0) max = costs.length;
        if (depth < costs.length && coins == 0) max = Math.max(max, depth + 1);
        if (coins < 0) {
            max = Math.max(max, depth - 1);
            return;
        }
        for (int i = index; i < costs.length; i++) {
            coins -= costs[index];
            dfs(costs, coins, i + 1, depth + 1);
            coins += costs[index];
        }
    }
}