package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 13:31
 */
public class Count2 {

    /**
     * 请编写一个方法，输出0到n(包括n)中数字2出现了几次。
     * <p>
     * 给定一个正整数n，请返回0到n的数字中2出现了几次。
     *
     * @param n
     * @return
     */
    public int countNumberOf2s(int n) {
        if (n < 1) {
            return 0;
        }
        int cnt = 0;
        for (int i = 1; i <= n; i *= 10) {
            int tmp1 = n / i;
            int tmp2 = n % i;
            cnt += (tmp1 + 7) / 10 * i + ((tmp1 % 10 == 2) ? tmp2 + 1 : 0);
        }
        return cnt;
    }
}
