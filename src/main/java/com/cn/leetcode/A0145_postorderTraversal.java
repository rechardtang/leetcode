package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [3,2,1]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * @see A0094_inorderTraversal
 * @see A0144_preorderTraversal
 */
public class A0145_postorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverseRecursively(root, result);
        return result;
    }

    private void traverseRecursively(TreeNode root, List<Integer> result) {
        if (root == null) return;
        traverseRecursively(root.left, result);
        traverseRecursively(root.right, result);
        result.add(root.val);
    }

}
