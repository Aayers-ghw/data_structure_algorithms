package programmerinterviewbook;

import interviewtop.util.ListNode;
import leetcodetop100.util.TreeNode;

import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 11:15
 */
public class Converter {

    /**
     * ��һ�����ƽ������ݽṹTreeNode��������val���Ժ�ָ����������ָ�롣
     * �����������ʾ���������(����leftָ���ʾ����ӣ�rightָ���ʾ�Ҷ���)��
     * ���дһ�������������������ת��Ϊһ���������ж�������������ݽṹ��TreeNodeʵ�֣�
     * ��������ݽṹ��ListNodeʵ�֡�
     * <p>
     * ��������������ĸ����ָ��root���뷵��ת���ɵ������ͷָ�롣
     *
     * @param root
     * @return
     */
    private ListNode head = new ListNode(-1);
    private ListNode q = head;

    public ListNode treeToList(TreeNode root) {
        // write code here
        if (root == null) {
            return null;
        }
        treeToList(root.left);
        q.next = new ListNode(root.val);
        q = q.next;
        treeToList(root.right);
        return head.next;
    }
}
