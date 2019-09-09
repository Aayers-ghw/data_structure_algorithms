package interview.huanjushidai;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 18:58
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String[] str = input[0].split("->");
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < str.length; ++i) {
            list.add(Integer.parseInt(str[i]));
        }
        int size = list.size();
        list.remove(size - Integer.parseInt(input[1]));
        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print("->");
            }
        }
    }
}
