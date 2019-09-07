package interview.xiaomi;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/6 18:49
 */
public class Solution02 {

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solution(int[] prices, int budget) {
        Arrays.sort(prices);
        int[] dp = new int[budget + 1];
        dp[0] = 1;
        for (int i = prices.length - 1; i >= 0; --i) {
            for (int j = prices[i]; j <= budget; ++j) {
                dp[j] = Math.min(dp[j], dp[j - prices[i]]);
            }
        }
        return dp[budget] == budget ? -1 : dp[budget];
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _prices_size = 0;
        _prices_size = Integer.parseInt(in.nextLine().trim());
        int[] _prices = new int[_prices_size];
        int _prices_item;
        for (int _prices_i = 0; _prices_i < _prices_size; _prices_i++) {
            _prices_item = Integer.parseInt(in.nextLine().trim());
            _prices[_prices_i] = _prices_item;
        }

        int _budget;
        _budget = Integer.parseInt(in.nextLine().trim());

        res = solution(_prices, _budget);
        System.out.println(String.valueOf(res));
    }
}

