package interview.qushikeji;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/8 18:12
 */
public class Adder {
    private static String add(String num1, String num2) {
        //Please write your code here
        if (num1 == null || num1.length() == 0) {
            return num2;
        }
        if (num2 == null || num2.length() == 0) {
            return num1;
        }
        String[] s1 = num1.split("\\.");
        String[] s2 = num2.split("\\.");
        if (s1.length == 2 && s2.length == 2) {
            char[] chars1 = s1[1].toCharArray();
            char[] chars2 = s2[1].toCharArray();
            int i = chars1.length - 1;
            int j = chars2.length - 1;
            int temp = 0;
            StringBuilder sb1 = new StringBuilder();
            while (i >= 0 || j >= 0) {
                while (j > i) {
                    sb1.append(chars2[j--]);
                }
                while (i > j) {
                    sb1.append(chars1[i--]);
                }
                int sum = temp + (chars1[i--] - '0') + (chars2[j--] - '0');
                sb1.append(sum % 10);
                temp = sum / 10;
            }
            StringBuilder sb2 = new StringBuilder();
            chars1 = s1[0].toCharArray();
            chars2 = s2[0].toCharArray();
            i = chars1.length - 1;
            j = chars2.length - 1;
            while (i >= 0 || j >= 0) {
                int sum = temp;
                if (i >= 0) {
                    sum += (chars1[i--] - '0');
                }
                if (j >= 0) {
                    sum += (chars2[j--] - '0');
                }
                sb2.append(sum % 10);
                temp = sum / 10;
            }
            if (temp != 0) {
                sb2.append(temp);
            }
            StringBuilder res = new StringBuilder(sb2.reverse().toString() + "." + sb1.reverse().toString());
            char[] chars = res.toString().toCharArray();
            int end;
            int start;
            for (start = 0; start < chars.length; ++start) {
                if (chars[start] - '0' != 0) {
                    break;
                }
            }
            for (end = chars.length - 1; end >= 0; --end) {
                if (chars[end] - '0' != 0) {
                    break;
                }
            }
            StringBuilder result = new StringBuilder();
            for (int k = start; k <= end; ++k) {
                result.append(chars[k]);
            }
            return result.toString();
        } else {
            StringBuilder sb = new StringBuilder();
            char[] chars1 = s1[0].toCharArray();
            char[] chars2 = s2[0].toCharArray();
            int i = chars1.length - 1;
            int j = chars2.length - 1;
            int temp = 0;
            while (i >= 0 || j >= 0) {
                int sum = temp;
                if (i >= 0) {
                    sum += (chars1[i--] - '0');
                }
                if (j >= 0) {
                    sum += (chars2[j--] - '0');
                }
                sb.append(sum % 10);
                temp = sum / 10;
            }
            if (temp != 0) {
                sb.append(temp);
            }
            char[] chars = sb.reverse().toString().toCharArray();
            int start;
            for (start = 0; start < chars.length; ++start) {
                if (chars[start] - '0' != 0) {
                    break;
                }
            }
            StringBuilder result = new StringBuilder();
            for (int k = start; k < chars.length; ++k) {
                result.append(chars[k]);
            }
            return result.toString();
        }
    }

    // please don't modify any code below.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String sum = add(num1, num2);
        System.out.println(sum);
    }
}
