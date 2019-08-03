package niuke2019;

import java.util.Scanner;

/**
 * Ò»·âÆæ¹ÖµÄÐÅ
 *
 * @author Aayers-ghw
 * @date 2019/8/3 14:39
 */
public class Solution17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[26];
        for (int i = 0; i < 26; ++i) {
            nums[i] = scanner.nextInt();
        }
        scanner.nextLine();
        char[] chars = scanner.nextLine().toCharArray();
        int res = 1;
        int count = 0;
        for (char ch : chars) {
            int temp = nums[ch - 'a'];
            if (count + temp > 100) {
                res++;
                count = temp;
            } else {
                count += temp;
            }
        }
        System.out.println(res + " " + count);
    }
}
