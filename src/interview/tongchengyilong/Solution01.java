package interview.tongchengyilong;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/29 18:57
 */
public class Solution01 {

    static String str1 = "_A";
    static String str2 = "_B";
    static String str3 = "_C";

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(str);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print(str1);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print(str2);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print(str3);
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}
