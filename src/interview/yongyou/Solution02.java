package interview.yongyou;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 13:48
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        BigDecimal bigDecimal1 = new BigDecimal(input[0]);
        BigDecimal bigDecimal2 = new BigDecimal(input[1]);
        System.out.println(bigDecimal1.multiply(bigDecimal2));
    }
}
