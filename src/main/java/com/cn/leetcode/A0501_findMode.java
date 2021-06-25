package com.cn.leetcode;

import com.cn.leetcode.internal.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 * <p>
 * 假定 BST 有如下定义：
 * <p>
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 * <p>
 * 1
 * \
 * 2
 * /
 * 2
 * 返回[2].
 * <p>
 * 提示：如果众数超过1个，不需考虑输出顺序
 * <p>
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 */
public class A0501_findMode {

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverseBST(root, list);
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, j = i + 1; i < list.size(); ) {
//            result
            map.put(i, 0);
            for (; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    map.put(i, map.get(i) + 1);
                }
            }
            i = j;
        }

        return null;
    }

    private void traverseBST(TreeNode root, List<Integer> list) {
        if (root == null) return;
        traverseBST(root.left, list);
        list.add(root.val);
        traverseBST(root.right, list);
    }
}
