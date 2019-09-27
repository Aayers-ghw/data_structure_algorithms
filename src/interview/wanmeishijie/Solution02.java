package interview.wanmeishijie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/27 19:46
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int limit = scanner.nextInt();
        int[] weight = new int[str.length];
        for (int i = 0; i < str.length; ++i) {
            weight[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(weight);
        int res = 0;
        int left = 0;
        int right = weight.length - 1;
        while (left <= right) {
            int sum = weight[left] + weight[right];
            if (sum <= limit) {
                left++;
            }
            res++;
            right--;
        }
        System.out.println(res);
    }
}
