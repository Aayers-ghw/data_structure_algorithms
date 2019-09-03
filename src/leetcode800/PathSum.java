package leetcode800;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/9/2 21:21
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.right == null && root.left == null && sum - root.val == 0) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
