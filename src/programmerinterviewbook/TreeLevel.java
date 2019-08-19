package programmerinterviewbook;

import interviewtop.util.ListNode;
import leetcodetop100.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 9:08
 */
public class TreeLevel {

    /**
     * 对于一棵二叉树，请设计一个算法，创建含有某一深度上所有结点的链表。
     * <p>
     * 给定二叉树的根结点指针TreeNode* root，以及链表上结点的深度，请返回一个链表ListNode，
     * 代表该深度上所有结点的值，请按树上从左往右的顺序链接，保证深度不超过树的高度，
     * 树上结点的值为非负整数且不超过100000。
     *
     * @param root
     * @param dep
     * @return
     */
    public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
        if (root == null) {
            return null;
        }
        ListNode res = new ListNode(-1);
        ListNode tmp = res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (--dep == 0) {
                for (int i = 0; i < size; ++i) {
                    TreeNode node = queue.poll();
                    tmp.next = new ListNode(node.val);
                    tmp = tmp.next;
                }
                break;
            }
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return res.next;
    }
}
