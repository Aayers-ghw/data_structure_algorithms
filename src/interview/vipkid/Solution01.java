package interview.vipkid;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/3 15:52
 */
public class Solution01 {

    /**
     * 给定一个整数的数组，找出其中的pair(a,  b)，使得a+b=0，并返回这样的pair数目。（a,  b）和(b,  a)是同一组。
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(",");
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; ++i) {
            nums[i] = Integer.parseInt(strings[i].trim());
        }
        boolean[] flag = new boolean[nums.length];
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (!flag[i] && !flag[j] && nums[i] + nums[j] == 0) {
                    res++;
                    flag[j] = true;
                }
            }
            flag[i] = true;
        }
        System.out.println(res);
    }
}
