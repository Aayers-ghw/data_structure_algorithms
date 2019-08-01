package leetcodetop100;

import leetcodetop100.util.TreeNode;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 13:55
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }
        int n = preorder.length;
        return help(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    private TreeNode help(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int value = preorder[preStart];
        int index = 0;
        for (int i = inStart; i <= inEnd; ++i) {
            if (inorder[i] == value) {
                break;
            }
            index++;
        }
        TreeNode root = new TreeNode(value);
        root.left = help(preorder, preStart + 1, preStart + index, inorder, inStart, inStart + index - 1);
        root.right = help(preorder, preStart + index + 1, preEnd, inorder, inStart + index + 1, inEnd);
        return root;
    }
}
