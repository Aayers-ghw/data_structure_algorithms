package niuke;

import java.util.*;

/**
 * 已知两颗二叉树，将它们合并成一颗二叉树。合并规则是：都存在的结点，就将结点值加起来，否则空的位置就由另一个树的结点来代替。
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
        for (int i = 0; i < treeArray1.length; ++i) {
            treeArray1[i] = scanner.nextInt();
        }
        for (int i = 0; i < treeArray2.length; ++i) {
            treeArray2[i] = scanner.nextInt();
        }
        scanner.close();

        TreeNode t1 = TreeNode.genTree(treeArray1);
        TreeNode t2 = TreeNode.genTree(treeArray2);
        TreeNode merge = mergeTree(t1, t2);

        bfs(merge);
    }

    public static TreeNode mergeTree(TreeNode t1, TreeNode t2) {
        if (t1 != null && t2 != null) {
            t1.left = mergeTree(t1.left, t2.left);
            t1.right = mergeTree(t1.right, t2.right);
            t1.val += t2.val;
        }
        return t1 == null ? t2 : t1;
    }

    public static void bfs(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                System.out.println(node.val + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }

    /**
     * 生成树
     *
     * @param array
     * @return
     */
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