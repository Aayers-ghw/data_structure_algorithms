package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 16:18
 */
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1]) {
                ans += prices[i] - prices[i - 1];
            }
        }
        return ans;
    }
}
