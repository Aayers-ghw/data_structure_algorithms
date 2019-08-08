package interview.qushikeji;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/8 19:17
 */
public class Main {
    private static String process(String num1, String num2)
    {
        //Please write your code here
        String[] s1 = num1.split(" ");
        int target = Integer.parseInt(num2);
        for (int i = 0; i < 6; ++i) {

        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strValueSequences = sc.nextLine();
        String strChargeNum = sc.nextLine();

        String sum = process(strValueSequences, strChargeNum);
        System.out.println(sum);
    }
}
