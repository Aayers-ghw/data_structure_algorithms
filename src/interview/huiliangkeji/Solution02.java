package interview.huiliangkeji;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/26 13:02
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        for (int i = strings.length - 1; i >= 0; --i) {
            System.out.print(strings[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
