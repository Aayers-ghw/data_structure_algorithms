package niuke;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 11:00
 */
public class Solution08 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (--n >= 0) {
            String[] str = scanner.nextLine().split(" ");
            if ("pop".equals(str[0])) {
                System.out.println(queue.poll());
            } else {
                queue.add(str[1]);
            }
        }
    }
}
