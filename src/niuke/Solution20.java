package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 14:53
 */
public class Solution20 {

    /**
     * 用字符串中的每一个字符（不是换行符或结束符'\0'）代表一位老师，输出排好后的队形。
     * 要求 Y字除去中心点外，上下半部分等高，按照从左到右，从上到下进行排序。队形中没人的部分用空格占位。
     * 输入数据保证可以排出一个完整的Y字，即长度为 3k+1 （k>=1）
     * <p>
     * 例如: 7个 x ，排成队形为（为了方便说明，这里用‘-’代替空格）：
     * x---x
     * -x-x
     * --x
     * --x
     * --x
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        if (str.length() % 3 != 1) {
            return;
        }
        int half = str.length() / 3;
        int row = half * 2 + 1;
        for (int i = 0; i < row; ++i) {

        }
    }
}
