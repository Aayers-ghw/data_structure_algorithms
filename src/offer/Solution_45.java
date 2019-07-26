package offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Aayers-ghw
 * @date 2019/7/23 19:09
 */
public class Solution_45 {

    public static String printMinNumber(int[] numbers) {
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; ++i) {
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = Integer.parseInt(o1 + o2);
                int j = Integer.parseInt(o2 + o1);
                return i - j;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String res = printMinNumber(new int[]{3, 32, 321});
        System.out.println(res);
    }
}
