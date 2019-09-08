package leetcode800;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/9/8 18:48
 */
public class LowestCommonAncestorOfaBinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        if (root.val > Math.max(p.val, q.val)) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < Math.min(p.val, q.val)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
