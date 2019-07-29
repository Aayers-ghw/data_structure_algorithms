package leetcodetop100;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 19:39
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int sum = 0;
        if (t1 != null) {
            sum += t1.val;
        }
        if (t2 != null) {
            sum += t2.val;
        }
        TreeNode node = new TreeNode(sum);
        node.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        node.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        return node;
    }
}
