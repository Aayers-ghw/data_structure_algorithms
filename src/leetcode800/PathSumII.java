package leetcode800;

import leetcodetop100.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/9/2 21:40
 */
public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        help(root, sum, res, new ArrayList<>());
        return res;
    }

    private void help(TreeNode node, int sum, List<List<Integer>> res, List<Integer> list) {
        if (node == null) {
            return;
        }
        sum -= node.val;
        list.add(node.val);
        if (node.left == null && node.right == null && sum == 0) {
            res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        help(node.left, sum, res, list);
        help(node.right, sum, res, list);
        list.remove(list.size() - 1);
    }
}
