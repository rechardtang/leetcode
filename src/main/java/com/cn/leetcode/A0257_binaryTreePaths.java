package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * <p>
 * 输出: ["1->2->5", "1->3"]
 * <p>
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * @see A0094_inorderTraversal
 */
public class A0257_binaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        findPathRecursively(root, "", result);
        return result;
    }

    private void findPathRecursively(TreeNode root, String path, List<String> result) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            path += root.val;
            result.add(path);
            return;
        }
        path += root.val + "->";
        findPathRecursively(root.left, path, result);
        findPathRecursively(root.right, path, result);
    }
}
