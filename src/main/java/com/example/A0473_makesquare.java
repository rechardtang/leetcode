package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 473. 火柴拼正方形
 * 还记得童话《卖火柴的小女孩》吗？现在，你知道小女孩有多少根火柴，请找出一种能使用所有火柴拼成一个正方形的方法。不能折断火柴，可以把火柴连接起来，并且每根火柴都要用到。
 * <p>
 * 输入为小女孩拥有火柴的数目，每根火柴用其长度表示。输出即为是否能用所有的火柴拼成正方形。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,1,2,2,2]
 * 输出: true
 * <p>
 * 解释: 能拼成一个边长为2的正方形，每边两根火柴。
 * 示例 2:
 * <p>
 * 输入: [3,3,3,3,4]
 * 输出: false
 * <p>
 * 解释: 不能用所有火柴拼成一个正方形。
 * 注意:
 * <p>
 * 给定的火柴长度和在 0 到 10^9之间。
 * 火柴数组的长度不超过15。
 */
public class A0473_makesquare {

    public boolean makesquare(int[] matchsticks) {
        Arrays.sort(matchsticks);
        System.out.println(Arrays.toString(matchsticks));
        int avg, sum = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            sum += matchsticks[i];
        }
        avg = sum / 4;
        boolean[] visited = new boolean[matchsticks.length];
        boolean[] matched = new boolean[matchsticks.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            for (int i = 0; i < matchsticks.length; i++) {
                if (visited[i]) continue;
                int sticksSum = pop + matchsticks[i];
                if (sticksSum == avg) {
                    visited[i] = true;
                    matched[i] = true;
                }
                if (sticksSum > avg) {
                    visited[i] = true;
                }
                if (!visited[i]) {
                    stack.push(sticksSum);
                }
            }
        }
        for (boolean m : matched) {
            if (!m) {
                return false;
            }
        }
        return true;
    }

}
