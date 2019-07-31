package interview.disifansi;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/7/31 19:52
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String res = multiply(s1, s2);
            System.out.println(res);
        }
    }

    private static String multiply(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int[] n1 = new int[chars1.length];
        int[] n2 = new int[chars2.length];
        int[] result = new int[chars1.length + chars2.length];

        for (int i = 0; i < chars1.length; ++i) {
            n1[i] = chars1[i] - '0';
        }
        for (int i = 0; i < chars2.length; ++i) {
            n2[i] = chars2[i] - '0';
        }

        for (int i = 0; i < n1.length; ++i) {
            for (int j = 0; j < n2.length; ++j) {
                result[i + j] += n1[i] * n2[j];
            }
        }

        //满10进位，从后往前满十进位
        for(int i =result.length-1; i > 0 ;i--){
            result[i-1] += result[i] / 10;
            result[i] = result[i] % 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length - 1; ++i) {
            sb.append(result[i]);
        }
        return sb.toString();
     }
}
