package interview.huiliangkeji;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/26 12:43
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); ++i) {
            if (map1.containsKey(str.charAt(i))) {
                map1.put(str.charAt(i), map1.get(str.charAt(i)) + 1);
            } else {
                map1.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(str.indexOf(entry.getKey()));
                return;
            }
        }
        System.out.println(-1);
    }
}
