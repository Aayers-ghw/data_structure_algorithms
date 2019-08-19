package programmerinterviewbook;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 9:27
 */
public class Successor {

    /**
     * 请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。
     * <p>
     * 给定树的根结点指针TreeNode* root和结点的值int p，请返回值为p的结点的后继结点的值。
     * 保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1。
     *
     * @param root
     * @param p
     * @return
     */
    static int res = 0;
    static boolean flag = false;
    public int findSucc(TreeNode root, int p) {
        // write code here
        if (root == null) {
            return -1;
        }
        help(root, p);
        return res;
    }

    public static void help(TreeNode root, int p) {
        if (root == null) {
            return;
        }
        help(root.left, p);
        if (flag) {
            res = root.val;
            flag = false;
            return;
        }
        if (root.val == p) {
            flag = true;
        }
        help(root.right, p);
    }
}
