package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 17:20
 */
public class UnusualAdd {

    /**
     * 请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
     * <p>
     * 给定两个int A和B。请返回A＋B的值
     *
     * 思路：
     * 二进制加法。发现一个特点。
     * 位的异或运算跟求'和'的结果一致：
     * 异或 1^1=0 1^0=1 0^0=0
     * 求和 1+1=0 1+0=1 0+0=0
     * 位的与运算跟求'进位‘的结果一致：
     * 位与 1&1=1 1&0=0 0&0=0
     * 进位 1+1=1 1+0=0 0+0=0
     *
     * @param A
     * @param B
     * @return
     */
    public int addAB(int A, int B) {
        // write code here
        int xor;
        int and;
        while (B != 0) {
            xor = A ^ B;
            and = A & B;
            A = xor;
            B = and << 1;
        }
        return A;
    }
}
