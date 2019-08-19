package programmerinterviewbook;

import leetcodetop100.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 9:26
 */
public class Checker {

    /**
     * ��ʵ��һ�����������һ�ö������Ƿ�Ϊ�����������
     * <p>
     * �������ĸ����ָ��TreeNode* root���뷵��һ��bool����������Ƿ�Ϊ�����������
     */

    List<Integer> list = new ArrayList<>();

    public boolean checkBST(TreeNode root) {
        // write code here
        inorder(root);
        for (int i = 1; i < list.size(); ++i) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
