package niuke2019;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/2 15:15
 */
public class Solution10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = new int[n];
        for (int i= 0; i < n; ++i) {
            a[i] = input.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        int min, max, i, h;
        for (i = 0; i < k; ++i) {
            min = 0;
            max = 0;
            for (int j = 0; j < n; ++j) {
                if (a[min] > a[j]) {
                    min = j;
                }
                if (a[max] < a[j]) {
                    max = j;
                }
            }
            if (a[max] - a[min] <= 0) {
                break;
            }
            sb.append((max + 1) + " " + (min + 1) + "\n");
            a[max]--;
            a[min]++;
        }
        min = 0;
        max = 0;
        for (int l = 0; l < n; ++l) {
            if (a[l] > a[max]) {
                max = l;
            }
            if (a[l] < a[min]) {
                min = l;
            }
        }
        h = a[max] - a[min];
        System.out.println(h + " " + i);
        System.out.println(sb.toString().trim());
    }
}
