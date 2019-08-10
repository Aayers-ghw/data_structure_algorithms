package leetcodetop100;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 10:33
 */
public class BinaryTreeMaximumPathSum {

    static int maxValue;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }

    public static int maxPathDown(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, maxPathDown(root.left));
        int right = Math.max(0, maxPathDown(root.right));
        maxValue = Math.max(maxValue, left + right + root.val);
        return Math.max(left, right) + root.val;
    }

    public static void main(String[] args) {
        int maxPathSum = new BinaryTreeMaximumPathSum().maxPathSum(new TreeNode(0));
        System.out.println(maxPathSum);
    }
}
