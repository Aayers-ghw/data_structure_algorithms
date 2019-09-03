package leetcode800;

import leetcodetop100.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/9/3 9:15
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) {
            help(root, res, "");
        }
        return res;
    }

    private void help(TreeNode root, List<String> res, String list) {
        if (root.right == null && root.left == null) {
            res.add(list + root.val);
        }
        if (root.left != null) {
            help(root.left, res, list + root.val + "->");
        }
        if (root.right != null) {
            help(root.right, res, list + root.val + "->");
        }
    }
}
