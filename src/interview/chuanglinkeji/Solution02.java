package interview.chuanglinkeji;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/3 19:14
 */
public class Solution02 {

    public static void main(String[] args) {
        String s1 = "ABCDEFGHI";
        String s2 = "JKLMNOPQR";
        String s3 = "STUVWXYZ*";
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int month = Integer.parseInt(s[0]);
        int day = Integer.parseInt(s[1]);
        String str = scanner.nextLine().replace(' ', '*');
        char[][] ss = new char[3][];
        month = month % 3 - 1;
        day = day % 9 - 1;
        ss[(0 - month + 3) % 3] = s1.toCharArray();
        ss[(1 - month + 3) % 3] = s2.toCharArray();
        ss[(2 - month + 3) % 3] = s3.toCharArray();
        leftRotateString(ss[0], ss[0].length, day);
        leftRotateString(ss[1], ss[1].length, day);
        leftRotateString(ss[2], ss[2].length, day);
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            boolean flag = false;
            for (int j = 0; j < ss[0].length; ++j) {
                if (ch == ss[0][j]) {
                    System.out.print(1);
                    System.out.print(j + 1);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int j = 0; j < ss[1].length; ++j) {
                    if (ch == ss[1][j]) {
                        System.out.print(2);
                        System.out.print(j + 1);
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                for (int j = 0; j < ss[2].length; ++j) {
                    if (ch == ss[2][j]) {
                        System.out.print(3);
                        System.out.print(j + 1);
                        break;
                    }
                }
            }
            if (i != str.length() - 1) {
                System.out.print(" ");
            }
        }
        return;
    }

    public static void leftRotateString(char[] chars, int n, int m) {
        m %= n;
        reverseString(chars, 0, m - 1);
        reverseString(chars, m , n - 1);
        reverseString(chars, 0 ,n - 1);
    }

    private static void reverseString(char[] chars, int from, int to) {
        while (from < to) {
            char ch = chars[from];
            chars[from] = chars[to];
            chars[to] = ch;
            from++;
            to--;
        }
    }
}
