package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 13:18
 */
public class Factor {

    /**
     * 请设计一个算法，计算n的阶乘有多少个尾随零。
     * <p>
     * 给定一个int n，请返回n的阶乘的尾零个数。保证n为正整数。
     * <p>
     * 思路：
     * <p>
     * 1、把n! 分解成若干个素数相乘，只有 2*5 才可能产生尾随零，而2 的数量多于5，所以问题转化为计算有多少个5.
     * <p>
     * 2、先数一数1到n之间有几个5的倍数（数量为n/5），然后数有几个25的倍数（数量为n/25），依次类推。
     *
     * @param n
     * @return
     */
    public int getFactorSuffixZero(int n) {
        // write code here
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
