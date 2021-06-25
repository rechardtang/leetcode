package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;

/**
 * 404. 左叶子之和
 * 计算给定二叉树的所有左叶子之和。
 * <p>
 * 示例：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */
public class A0404_sumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + sum;
    }
}
