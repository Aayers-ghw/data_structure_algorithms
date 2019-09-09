package interview.qianxin;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 19:54
 */
public class Solution02 {

    /**
     * 二元查找树（1.若左子树不空，左子树值都小于父节点；2.如右子树不空，右子树值都大于父节点；3.左、右子树都是二元查找树；4. 没有键值相等的节点）上任意两个节点的值，请找出它们最近的公共祖先。
     * <p>
     * 输入三行行，第一行为树层级，第二行为数节点（其中-1表示为空节点），第三行为需要查找祖先的两个数。
     * <p>
     * 在例图中（虚线框没有真实节点，为了输入方便对应位置输-1）查找12和20的最近公共祖先输入为：
     * <p>
     * 4
     * <p>
     * 9 6 15 2 -1 12 25 -1 -1 -1 -1 -1 -1 20 37
     * <p>
     * 12 20
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            String[] str = scanner.nextLine().split(" ");
            if (str.length == 0) {
                System.out.println(-1);
                break;
            }
            int[] nums = new int[str.length + 1];
            for (int i = 1; i < nums.length; ++i) {
                nums[i] = Integer.parseInt(str[i - 1]);
            }
            int m1 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int cnt = 0;
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] == m1 || nums[i] == m2) {
                    cnt++;
                }
            }
            if (cnt != 2) {
                System.out.println(-1);
                break;
            }
            int index = 1;
            while (--n >= 0) {
                if (nums[index] == -1) {
                    System.out.println(-1);
                    break;
                }
                if (nums[index] == m1 || nums[index] == m2) {
                    System.out.println(nums[index]);
                    break;
                }
                if (nums[index] > Math.min(m1, m2) && nums[index] < Math.max(m1, m2)) {
                    System.out.println(nums[index]);
                    break;
                }
                if (nums[index] < Math.min(m1, m2)) {
                    index = index * 2 + 1;
                } else {
                    index = index * 2;
                }
            }
            System.out.println(-1);
        }
    }
}
