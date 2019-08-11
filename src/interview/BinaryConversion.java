package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 36进制加法
 *
 * @author Aayers-ghw
 * @date 2019/8/11 15:04
 */
public class BinaryConversion {
    static Character[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static List<Character> list = Arrays.asList(nums);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String res = add(str1, str2);
        System.out.println(res);
    }

    public static String add(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int i = s1.length - 1;
        int j = s2.length - 1;
        //进位
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0) {
            int index1 = list.indexOf(s1[i]);
            int index2 = list.indexOf(s2[j]);
            int sum = index1 + index2 + temp;
            temp = sum / 36;
            sb.append(list.get(sum % 36));
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = list.indexOf(s1[i]) + temp;
            temp = sum / 36;
            sb.append(list.get(sum % 36));
            i--;
        }
        while (j >= 0) {
            int sum = list.indexOf(s2[j]) + temp;
            temp = sum / 36;
            sb.append(list.get(sum % 36));
            j--;
        }
        if (temp != 0) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
