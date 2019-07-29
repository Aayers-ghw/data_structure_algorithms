package leetcodetop100;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 19:24
 */
public class DiameterOfBinaryTree {

    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
