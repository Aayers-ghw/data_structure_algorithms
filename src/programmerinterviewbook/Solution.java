package programmerinterviewbook;

import leetcodetop100.util.TreeNode;

import java.util.ArrayList;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 10:32
 */
public class Solution {

    /**
     * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
     * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
     * (ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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
