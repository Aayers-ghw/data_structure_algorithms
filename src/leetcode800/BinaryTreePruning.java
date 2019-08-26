package leetcode800;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/26 20:37
 */
public class BinaryTreePruning {

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }
}
