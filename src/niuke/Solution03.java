package niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ��֪���Ŷ������������Ǻϲ���һ�Ŷ��������ϲ������ǣ������ڵĽ�㣬�ͽ����ֵ������������յ�λ�þ�����һ�����Ľ�������档
 *
 * @author Aayers-ghw
 * @date 2019/9/6 16:57
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodeNum1 = scanner.nextInt();
        int nodeNum2 = scanner.nextInt();

        int[] treeArray1 = new int[3 * nodeNum1];
        int[] treeArray2 = new int[3 * nodeNum2];
    }
}
class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val) {
        this.val = val;
    }

    //������
    public static TreeNode genTree(int[] array) {
        Map<Integer, TreeNode> map = new HashMap<>();
        TreeNode root = new TreeNode(0);
        TreeNode head = root;
        for (int i = 0, layer = 1; i < array.length; i += 3, layer++) {
            int left = array[i];
            int right = array[i + 1];
            int val = array[i + 1];

            if (map.containsKey(layer)) {
                root = map.get(layer);
            }

            root.val = val;

            if (left == 0) {
                root.left = null;
            } else {
                root.left = new TreeNode(0);
                map.put(left, root.left);
            }

            if (right == 0) {
                root.right = null;
            } else {
                root.right = new TreeNode(0);
                map.put(right, root.right);
            }
        }

        return head;
    }
}