package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 10:00
 */
public class Rank {

    /**
     * 现在我们要读入一串数，同时要求在读入每个数的时候算出它的秩，即在当前数组中小于等于它的数的个数(不包括它自身)，
     * 请设计一个高效的数据结构和算法来实现这个功能。
     * <p>
     * 给定一个int数组A，同时给定它的大小n，请返回一个int数组，元素为每次加入的数的秩。保证数组大小小于等于5000。
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
