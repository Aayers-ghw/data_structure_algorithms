package leetcodetop100;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 16:22
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return -1;
        }
        Arrays.sort(coins);
        int res = 0;
        for (int i = 0; i < coins.length; ++i) {
            while (coins[i] <= amount) {
                amount -= coins[i];
                res++;
            }
        }
        return res;
    }
}
