package interview.dmai;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/18 13:55
 */
public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(",");
        Arrays.sort(str);
        for (int i = 0; i < str.length; ++i) {
            System.out.print(str[i]);
            if (i != str.length - 1) {
                System.out.print(",");
            }
        }
    }
}
