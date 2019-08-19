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
     * ����һ�ö������������һ���㷨����������ĳһ��������н�������
     * <p>
     * �����������ĸ����ָ��TreeNode* root���Լ������Ͻ�����ȣ��뷵��һ������ListNode��
     * �������������н���ֵ���밴���ϴ������ҵ�˳�����ӣ���֤��Ȳ��������ĸ߶ȣ�
     * ���Ͻ���ֵΪ�Ǹ������Ҳ�����100000��
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
