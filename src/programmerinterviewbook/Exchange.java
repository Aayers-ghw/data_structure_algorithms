package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 11:29
 */
public class Exchange {

    public int exchangeOddEven(int x) {
        // write code here
        int odd = (x & 0x55555555);
        int even = (x & 0xaaaaaaaa);
        return (odd << 1) + (even >>> 1);
    }
}
