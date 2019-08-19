package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 10:42
 */
public class BinInsert {

    /**
     * 有两个32位整数n和m，请编写算法将m的二进制数位插入到n的二进制的第j到第i位,其中二进制的位数从低位数到高位且以0开始。
     * <p>
     * 给定两个数int n和int m，同时给定int j和int i，意义如题所述，请返回操作后的数，
     * 保证n的第j到第i位均为零，且m的二进制位数小于等于i-j+1。
     *
     * @param n
     * @param m
     * @param j
     * @param i
     * @return
     */
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        /**
         * 思路
         *                          i   j
         * 1024：              1000 00000 00
         * 19：                     10011
         * 可以看到上面得出，只要我们用1011与1024的第j位到第i位做或运算（|）即可。
         * 我们想到可以让10011左移j位就可以正常做运算了。
         * 10000000000
         * 00001001100
         * -------------------
         * 10001001100 ---->1100（十进制）
         */
        m <<= j;
        return m | n;
    }
}
