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
     * ����
     * ����ǰ�����Ӣ�Ķ��ŷָ���ָ���Ľڵ㡣�ڵ��ֵ���������͡�
     * <p>
     * ���
     * �������ָ���ڵ����һ���ڵ�ֵ�������쳣�����û����һ���ڵ㣬��������� -1 ��ʾ��
     * <p>
     * <p>
     * ��������
     * 1,2,3,4,5,6,7,8,9
     * 4
     * �������
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
