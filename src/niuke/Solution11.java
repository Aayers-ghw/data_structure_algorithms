package niuke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 16:13
 */
public class Solution11 {

    /**
     * 有一个城市需要修建，给你N个民居的坐标X,Y，问把这么多民居全都包进城市的话，城市所需最小面积是多少（注意，城市为平行于坐标轴的正方形）
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
