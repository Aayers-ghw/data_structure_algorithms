package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 16:21
 */
public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxDiff = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] < min) {
                min = prices[i];
            }
            maxDiff = Math.max(maxDiff, prices[i] - min);
        }
        return maxDiff;
    }
}
