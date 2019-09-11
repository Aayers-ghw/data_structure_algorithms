package niuke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 16:13
 */
public class Solution11 {

    /**
     * ��һ��������Ҫ�޽�������N����ӵ�����X,Y���ʰ���ô�����ȫ���������еĻ�������������С����Ƕ��٣�ע�⣬����Ϊƽ����������������Σ�
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println(0);
            return;
        }
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0 ; i < n; ++i) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        long diffX = Math.abs(x[x.length - 1] - x[0]);
        long diffY = Math.abs(y[y.length - 1] - y[0]);
        if (diffX > diffY) {
            System.out.println(diffX * diffX);
        } else {
            System.out.println(diffY * diffY);
        }
    }
}
