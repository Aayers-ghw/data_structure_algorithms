package leetcodetop100;

import leetcodetop100.util.TreeNode;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/7/26 19:26
 */
public class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        pushAll(root);
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void pushAll(TreeNode root) {
        for (; root != null; stack.push(root), root = root.left) {

        }
    }
}
