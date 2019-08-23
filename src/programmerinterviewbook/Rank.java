package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 10:00
 */
public class Rank {

    /**
     * ��������Ҫ����һ������ͬʱҪ���ڶ���ÿ������ʱ����������ȣ����ڵ�ǰ������С�ڵ����������ĸ���(������������)��
     * �����һ����Ч�����ݽṹ���㷨��ʵ��������ܡ�
     * <p>
     * ����һ��int����A��ͬʱ�������Ĵ�Сn���뷵��һ��int���飬Ԫ��Ϊÿ�μ���������ȡ���֤�����СС�ڵ���5000��
     */

    Node root = null;

    public int[] getRankOfNumber(int[] A, int n) {
        // write code here
        if (A == null || A.length == 0) {
            return new int[]{};
        }
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = help(A[i]);
        }
        return res;
    }

    public int help(int a) {
        if (root == null) {
            root = new Node(a);
        } else {
            root.insert(a);
        }
        return root.getRank(a);
    }

    class Node {
        int leftSize = 0;
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public void insert(int val) {
            if (val <= this.val) {
                if (left != null) {
                    left.insert(val);
                } else {
                    left = new Node(val);
                }
                leftSize++;
            } else {
                if (right != null) {
                    right.insert(val);
                } else {
                    right = new Node(val);
                }
            }
        }

        public int getRank(int val) {
            if (this.val == val) {
                return leftSize;
            }
            if (val < this.val) {
                return left.getRank(val);
            } else {
                return leftSize + 1 + right.getRank(val);
            }
        }
    }
}
