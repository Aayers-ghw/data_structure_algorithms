package leetcodetop100;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 18:31
 */
public class PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        return help(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int help(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return (root.val == sum ? 1 : 0) + help(root.left, sum - root.val) + help(root.right, sum - root.val);
    }
}
