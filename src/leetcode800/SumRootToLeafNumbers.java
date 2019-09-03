package leetcode800;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/9/3 9:03
 */
public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    private int sum(TreeNode root, int s) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return s * 10 + root.val;
        }
        return sum(root.left, s * 10 + root.val) + sum(root.right, s * 10 + root.val);
    }
}
