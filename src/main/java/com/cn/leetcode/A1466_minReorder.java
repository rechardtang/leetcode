package com.cn.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1466. 重新规划路线
 * n 座城市，从 0 到 n-1 编号，其间共有 n-1 条路线。因此，要想在两座不同城市之间旅行只有唯一一条路线可供选择（路线网形成一颗树）。去年，交通运输部决定重新规划路线，以改变交通拥堵的状况。
 *
 * 路线用 connections 表示，其中 connections[i] = [a, b] 表示从城市 a 到 b 的一条有向路线。
 *
 * 今年，城市 0 将会举办一场大型比赛，很多游客都想前往城市 0 。
 *
 * 请你帮助重新规划路线方向，使每个城市都可以访问城市 0 。返回需要变更方向的最小路线数。
 *
 * 题目数据 保证 每个城市在重新规划路线方向后都能到达城市 0 。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]
 * 输出：3
 * 解释：更改以红色显示的路线的方向，使每个城市都可以到达城市 0 。
 * 示例 2：
 *
 *
 *
 * 输入：n = 5, connections = [[1,0],[1,2],[3,2],[3,4]]
 * 输出：2
 * 解释：更改以红色显示的路线的方向，使每个城市都可以到达城市 0 。
 * 示例 3：
 *
 * 输入：n = 3, connections = [[1,0],[2,0]]
 * 输出：0
 *
 *
 * 提示：
 *
 * 2 <= n <= 5 * 10^4
 * connections.length == n-1
 * connections[i].length == 2
 * 0 <= connections[i][0], connections[i][1] <= n-1
 * connections[i][0] != connections[i][1]
 */
public class A1466_minReorder {

    public int minReorder(int n, int[][] connections) {

        int[] map = new int[n];
        for(int i = 0; i < n; i++){
            map[i] = i;
        }

        Queue<int[]> queue = new LinkedList<>();
        for(int[] c: connections){
            queue.offer(c);
        }
        map[0] = 0;
        int res = 0;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int a1 = find(map, cur[0]);
            int a2 = find(map, cur[1]);
            if(a1 == 0 && a2 != 0){
                res++;
                map[cur[1]] = 0;
            }else if(a1 != 0 && a2 != 0){
                queue.offer(cur);
            }else{
                map[cur[0]] = 0;
                map[cur[1]] = 0;
            }
        }
        return res;
    }

    private int find(int[] map, int id){
        while(id != map[id]){
            map[id] = map[map[id]];
            id = map[id];
        }
        return id;
    }
}
