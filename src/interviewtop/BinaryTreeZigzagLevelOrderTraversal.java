package interviewtop;

import leetcodetop100.util.TreeNode;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/11 14:16
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int count = 1;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (count == 1) {
                int size = stack1.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; ++i) {
                    TreeNode node = stack1.pop();
                    list.add(node.val);
                    if (node.left != null) {
                        stack2.push(node.left);
                    }
                    if (node.right != null) {
                        stack2.push(node.right);
                    }
                }
                res.add(list);
                count = 2;
            } else if (count == 2) {
                int size = stack2.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; ++i) {
                    TreeNode node = stack2.pop();
                    list.add(node.val);
                    if (node.right != null) {
                        stack1.push(node.right);
                    }
                    if (node.left != null) {
                        stack1.push(node.left);
                    }
                }
                res.add(list);
                count = 1;
            }
        }
        return res;
    }
}
