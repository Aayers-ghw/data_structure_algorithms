package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 11:04
 */
public class ExchangeII {

    /**
     * 请编写一个函数，函数内不使用任何临时变量，直接交换两个数的值。
     * <p>
     * 给定一个int数组AB，其第零个元素和第一个元素为待交换的值，请返回交换后的数组。
     *
     * @param AB
     * @return
     */
    public int[] exchangeAB(int[] AB) {
        // write code here
        if (AB == null || AB.length < 2) {
            return AB;
        }
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }
}
