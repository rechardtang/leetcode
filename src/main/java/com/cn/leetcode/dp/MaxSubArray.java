package com.cn.leetcode.dp;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 示例 2：
 * <p>
 * 输入：nums = [1]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：nums = [0]
 * 输出：0
 * 示例 4：
 * <p>
 * 输入：nums = [-1]
 * 输出：-1
 * 示例 5：
 * <p>
 * 输入：nums = [-100000]
 * 输出：-100000
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -105 <= nums[i] <= 105
 *  
 * <p>
 * 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxSubArray {
    public int maxSubArrayN2(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public int maxSubArrayN(int[] nums) {
        int size = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    public int maxSubArrayP(int[] nums) {
        int pre = 0;
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            res = Math.max(res, pre);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxSubArray m = new MaxSubArray();
        System.out.println(m.maxSubArrayN2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(m.maxSubArrayN2(new int[]{1}));
        System.out.println(m.maxSubArrayN2(new int[]{0}));
        System.out.println(m.maxSubArrayN2(new int[]{-10000}));
        System.out.println("======================");
        System.out.println(m.maxSubArrayN(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(m.maxSubArrayN(new int[]{1}));
        System.out.println(m.maxSubArrayN(new int[]{0}));
        System.out.println(m.maxSubArrayN(new int[]{-10000}));
        System.out.println("======================");
        System.out.println(m.maxSubArrayP(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(m.maxSubArrayP(new int[]{1}));
        System.out.println(m.maxSubArrayP(new int[]{0}));
        System.out.println(m.maxSubArrayP(new int[]{-10000}));
    }
}
