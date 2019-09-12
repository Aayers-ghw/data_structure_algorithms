package interview.tongcheng;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Aayers-ghw
 * @date 2019/9/12 19:47
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        Set<Integer> set = new HashSet<>();
        for (String s : input) {
            set.add(Integer.parseInt(s));
        }
        System.out.println(set.size());
    }
}
