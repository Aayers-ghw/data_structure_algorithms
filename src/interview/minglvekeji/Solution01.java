package interview.minglvekeji;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 14:49
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        for (int i = str.length - 1; i >= 0; --i) {
            System.out.print(str[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
