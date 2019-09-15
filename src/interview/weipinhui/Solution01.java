package interview.weipinhui;

import leetcodetop100.util.TreeNode;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 18:19
 */
public class Solution01 {

    static int max = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = new TreeNode(4);
        node1.right = new TreeNode(5);
        maxDepth(root);
        System.out.println(max);
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
