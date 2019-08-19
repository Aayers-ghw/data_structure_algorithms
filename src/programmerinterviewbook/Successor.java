package programmerinterviewbook;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 9:27
 */
public class Successor {

    /**
     * �����һ���㷨��Ѱ�Ҷ�������ָ��������һ����㣨����������ĺ�̣���
     * <p>
     * �������ĸ����ָ��TreeNode* root�ͽ���ֵint p���뷵��ֵΪp�Ľ��ĺ�̽���ֵ��
     * ��֤����ֵ���ڵ�����С�ڵ���100000��û���ظ�ֵ���������ں�̷���-1��
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
