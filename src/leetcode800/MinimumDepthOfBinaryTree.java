package leetcode800;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/9/2 21:20
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        return depth(root);
    }

    private static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left != null && node.right != null) {
            return 1 + Math.min(depth(node.left), depth(node.right));
        }
        if (node.left == null) {
            return 1 + depth(node.right);
        }
        if (node.right == null) {
            return 1 + depth(node.left);
        }
        return 0;
    }
}
