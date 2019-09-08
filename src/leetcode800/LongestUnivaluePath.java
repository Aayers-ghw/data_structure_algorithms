package leetcode800;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/9/8 9:31
 */
public class LongestUnivaluePath {

    int len = 0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getLen(root, root.val);
        return len;
    }

    private int getLen(TreeNode node, int val) {
        if (node == null) {
            return 0;
        }
        int left = getLen(node.left, node.val);
        int right = getLen(node.right, node.val);
        len = Math.max(len, left + right);
        if (node.val == val) {
            return Math.max(left, right) + 1;
        }
        return 0;
    }
}
