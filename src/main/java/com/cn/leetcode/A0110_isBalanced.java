package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;

/**
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,2,2,3,3,null,null,4,4]
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：root = []
 * 输出：true
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中的节点数在范围 [0, 5000] 内
 * -104 <= Node.val <= 104
 *
 * @see A0104_maxDepth
 */
public class A0110_isBalanced {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        boolean balanced = isBalanced(root.left) && isBalanced(root.right);
        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);
        return balanced && Math.abs(depthLeft - depthRight) <= 1;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public boolean isBalanced2(TreeNode root) {
        if (root == null) return true;
        return maxDepth2(root) > 0;
    }

    private int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        int ld = maxDepth2(root.left);
        int rd = maxDepth2(root.right);
        if (ld >= 0 && rd >= 0 && Math.abs(ld - rd) <= 1) {
            return Math.max(ld, rd) + 1;
        }
        return -1;
    }

}
