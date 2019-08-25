package interview.kuaishou;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 17:01
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        while (--m >= 0) {
            String s = scanner.nextLine();
            String[] str = s.split(" ");
            String[] s1 = str[0].split("\\.");
            String[] s2 = str[1].split("\\.");
            long x;
            if (s1.length == 1) {
                x = Long.parseLong(s1[0]);
            } else {
                x = help(s1);
            }
            long y;
            if (s2.length == 1) {
                y = Long.parseLong(s2[0]);
            } else {
                y = help(s2);
            }
            if (x < y) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }

    public static long help(String[] c1) {
        int[] nums = new int[c1.length];
        for (int i = 0; i < c1.length; ++i) {
            if (i == 0) {
                while (i < c1.length && Integer.parseInt(c1[i]) == 0) {
                    i++;
                }
                if (i == c1.length) {
                    break;
                }
            }
            nums[i] = Integer.parseInt(c1[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; --i) {
            if (i == nums.length - 1) {
                while (i >= 0 && nums[i] == 0) {
                    i--;
                }
                if (i < 0) {
                    break;
                }
            }
            sb.append(nums[i]);
        }
        String res = sb.toString();
        long x;
        try {
            x = Long.parseLong(res);
        } catch (Exception e) {
            return 0;
        }
        return x;
    }
}
