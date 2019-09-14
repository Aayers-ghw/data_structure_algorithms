package niuke;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 16:28
 */
public class Solution18 {
    /**
     * 已知某序列S=<e1,e2,…,en>，序列中的元素类型为整数（en <= 2^10），序列的长度为可变长度。
     * 现在有若干序列S1，S2,…,Sn，现在要求设计一种算法，找出这些重复的序列。输出重复序列的序号，如果有多组重复，需全部输出。
     * <p>
     * 所有序列中的数字个数加起来，小于1000000，序列个数小于10000个。
     * <p>
     * 例如现有3个序列
     * S1=<65,43,177,655>
     * S2=<1,2,3,4,5,6,7>
     * S3=<65,43,177,655,3>
     * 这时序列无重复。又如
     * S1=<65,43,177,655,3>
     * S2=<1,2,3,4,5,6,7>
     * S3=<65,43,177,655,3>
     * 这时序列有重复。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List> nums = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int nn = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nn; ++j) {
                list.add(scanner.nextInt());
            }
            nums.add(list);
        }
        boolean no = true;
        boolean[] flag = new boolean[n];
        for (int i = 0; i < n; ++i) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(i);
            if (flag[i]) {
                continue;
            }
            flag[i] = true;
            for (int j = i + 1; j < n; ++j) {
                boolean b = help(nums.get(i), nums.get(j));
                if (b) {
                    if (no) {
                        no = false;
                    }
                    flag[j] = true;
                    tmp.add(j);
                }
            }
            if (tmp.size() > 1) {
                for (int j = 0; j < tmp.size(); ++j) {
                    System.out.print(tmp.get(j));
                    if (j != tmp.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        if (no) {
            System.out.println("no");
        }
    }

    private static boolean help(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); ++i) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
