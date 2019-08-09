package interview.duoyi;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/9 16:13
 */
public class AndSet {

    public static void main(String[] args) {
        //����ڵ��ֱ�Ӹ��ڵ�
        int[]  pre = new int[1050];
        int n;
        int m;
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            //��ʼ��pre����
            for (int i = 1; i <= n; ++i) {
                pre[i] = i;
            }
            //������ͨ���������pre����
            for (int i = 1; i <= m; ++i) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                join(pre, a, b);
            }
            for (int i = 1; i <= n; ++i) {
                if (pre[i] == i) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    private static void join(int[] pre, int x, int y) {
        int fx = find(pre, x);
        int fy = find(pre, y);
        if (fx != fy) {
            pre[fy] = pre[fx];
        }
    }

    /**
     * ����x�ĸ��ڵ�
     * @param a
     * @return
     */
    private static int find(int[] pre, int a) {
        if (pre[a] != a) {
            //·��ѹ������������Ϊ�������ӽ��
            find(pre, pre[a]);
        }
        return pre[a];
    }
}
