package programmerinterviewbook;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 15:25
 */
public class Balance {

    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }

    public static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + depth(node.left) + depth(node.right);
    }
}
