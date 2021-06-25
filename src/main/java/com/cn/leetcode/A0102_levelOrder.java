package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;

import java.util.*;

/**
 * 102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * <p>
 * <p>
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层序遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class A0102_levelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            TreeNode first = queue.poll();
            if (first.left != null)
                queue.addLast(first.left);
            if (first.right != null)
                queue.addLast(first.right);
        }
        return result;
    }

}
