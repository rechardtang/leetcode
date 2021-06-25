package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 * <p>
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：root = [1]
 * 输出：[1]
 * 示例 4：
 * <p>
 * <p>
 * 输入：root = [1,2]
 * 输出：[2,1]
 * 示例 5：
 * <p>
 * <p>
 * 输入：root = [1,null,2]
 * 输出：[1,2]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 * <p>
 * <p>
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * @see A0144_preorderTraversal
 * @see A0145_postorderTraversal
 */
public class A0094_inorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverseRecursively(root, result);
        return result;
    }

    private void traverseRecursively(TreeNode root, List<Integer> result) {
        if (root == null) return;
        traverseRecursively(root.left, result);
        result.add(root.val);
        traverseRecursively(root.right, result);
    }

    public List<Integer> inorderTraversalDFS(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode ptr = root;
        while (!stack.isEmpty() || ptr != null) {
            if (ptr != null) {
                stack.push(ptr);
                ptr = ptr.left;
            }else{
                TreeNode pop = stack.pop();
                result.add(pop.val);
                ptr = pop.right;
            }
        }
        return result;
    }

}
