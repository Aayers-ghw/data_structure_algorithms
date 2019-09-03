package interview.vipkid;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/3 15:52
 */
public class Solution01 {

    /**
     * ����һ�����������飬�ҳ����е�pair(a,  b)��ʹ��a+b=0��������������pair��Ŀ����a,  b����(b,  a)��ͬһ�顣
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
