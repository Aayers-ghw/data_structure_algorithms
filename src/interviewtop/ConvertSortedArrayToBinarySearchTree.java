package interviewtop;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 15:53
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return help(nums, 0, nums.length - 1);
    }

    public static TreeNode help(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + ((right - left) >> 1);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums, left, mid - 1);
        root.right = help(nums, mid + 1, right);
        return root;
    }
}
