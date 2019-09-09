package interview.huanjushidai;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 18:58
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); ++i) {
            if (map.containsKey(input.charAt(i))) {
                continue;
            } else {
                map.put(input.charAt(i) + "", i);
            }
        }
    }
}
