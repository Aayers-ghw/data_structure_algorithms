package interview.liulishuo;

import java.util.*;

/**
 * 请设计一个算法，给一个字符串进行二进制编码，使得编码后字符串的长度最短。
 *
 * @author Aayers-ghw
 * @date 2019/7/30 18:48
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            int result = hufuman(s);
            System.out.println(result);
        }
    }

    private static int hufuman(String s) {
        char[] chars = s.toCharArray();
        //hash表存放每个字符和出现的次数
        Map<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < chars.length; ++i) {
            if (hash.containsKey(chars[i])) {
                hash.put(chars[i], hash.get(chars[i]) + 1);
            } else {
                hash.put(chars[i], 1);
            }
        }
        //优先队列(最小堆)，每次能得到weight最小的node
        Queue<TreeNode> queue = new PriorityQueue<>(hash.size(), new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                return Integer.compare(o1.weight, o2.weight);
            }
        });
        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            queue.add(new TreeNode(entry.getValue(), entry.getKey()));
        }
        while (queue.size() > 1) {
            //弹出两个最小的，合并成一个node
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            TreeNode father = new TreeNode(left.weight + right.weight);
            father.left = left;
            father.right = right;
            queue.add(father);
        }
        TreeNode root = queue.poll();
        //计算长度
        return valLength(root, 0);
    }

    public static int valLength(TreeNode node, int depth) {
        if (node == null) {
            return 0;
        }
        return (node.ch == null ? 0 : node.weight) * depth + valLength(node.left, depth + 1)
                + valLength(node.right, depth + 1);

    }

    static class TreeNode {
        int weight;//权重，出现次数
        Character ch;//如果是初始字符，则ch为字符，如果是合并的，则为null
        TreeNode left;
        TreeNode right;

        public TreeNode(int weight) {
            this.weight = weight;
        }

        public TreeNode(int weight, Character ch) {
            this.weight = weight;
            this.ch = ch;
        }
    }
}
