package interview.liulishuo;

import java.util.*;

/**
 * �����һ���㷨����һ���ַ������ж����Ʊ��룬ʹ�ñ�����ַ����ĳ�����̡�
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
        //hash����ÿ���ַ��ͳ��ֵĴ���
        Map<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < chars.length; ++i) {
            if (hash.containsKey(chars[i])) {
                hash.put(chars[i], hash.get(chars[i]) + 1);
            } else {
                hash.put(chars[i], 1);
            }
        }
        //���ȶ���(��С��)��ÿ���ܵõ�weight��С��node
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
            //����������С�ģ��ϲ���һ��node
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            TreeNode father = new TreeNode(left.weight + right.weight);
            father.left = left;
            father.right = right;
            queue.add(father);
        }
        TreeNode root = queue.poll();
        //���㳤��
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
        int weight;//Ȩ�أ����ִ���
        Character ch;//����ǳ�ʼ�ַ�����chΪ�ַ�������Ǻϲ��ģ���Ϊnull
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
