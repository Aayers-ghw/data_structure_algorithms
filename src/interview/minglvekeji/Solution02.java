package interview.minglvekeji;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 15:53
 */
public class Solution02 {

    public static void main(String[] args) {
        String[] shuzi = "零、壹、贰、叁、肆、伍、陆、柒、捌、玖".split("、");
        String[] qian = "、十、佰、仟、万、十万、百万、千万、亿、十亿、百亿、千亿".split("、");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] res = input.split("\\.");
        StringBuilder sb = new StringBuilder("人民币");

    }
}
