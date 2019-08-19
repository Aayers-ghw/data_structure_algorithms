package programmerinterviewbook;

import leetcodetop100.util.TreeNode;

import java.util.ArrayList;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 10:32
 */
public class Solution {

    /**
     * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * (注意: 在返回值的list中，数组长度大的数组靠前)
     *
     * @param root
     * @param target
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        help(root, res, new ArrayList<>(), target);
        return res;
    }

    public static void help(TreeNode root, ArrayList<ArrayList<Integer>> res,
                            ArrayList<Integer> tmpList, int target) {
        if (root == null) {
            return;
        }
        tmpList.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(tmpList));
            tmpList.remove(tmpList.size() - 1);
            return;
        }
        help(root.left, res, tmpList, target);
        help(root.right, res, tmpList, target);
        tmpList.remove(tmpList.size() - 1);
    }
}
