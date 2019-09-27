package interview.mafengwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/23 19:48
 */
public class Solution02 {

    /**
     * 输入
     * 树的前序遍历英文逗号分隔和指定的节点。节点的值必须是整型。
     * <p>
     * 输出
     * 中序遍历指定节点的下一个节点值。所有异常情况和没有下一个节点，请输出整型 -1 表示。
     * <p>
     * <p>
     * 样例输入
     * 1,2,3,4,5,6,7,8,9
     * 4
     * 样例输出
     * 9
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(",");
        int target = scanner.nextInt();
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; ++i) {
            nums[i] = Integer.parseInt(str[i]);
        }
        Node root = buildTree(nums);

    }


    public static Node buildTree(int[] nums) {
        if (nums.length == 1) {
            return new Node(nums[0]);
        }
        List<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            nodeList.add(new Node(nums[i]));
        }
        for (int i = 0; i <= nums.length / 2; ++i) {
            if (2 * i - 1 <= nums.length - 1) {
                nodeList.get(i - 1).left = nodeList.get(2 * i - 1);
            }
            if (2 * i <= nums.length - 1) {
                nodeList.get(i - 1).right = nodeList.get(2 * i);
            }
        }
        return nodeList.get(0);
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(int val) {
        this.val = val;
    }
}
