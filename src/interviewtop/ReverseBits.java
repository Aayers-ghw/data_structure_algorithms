package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 18:14
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            res += (n & 1);
            n >>>= 1;
            if (i < 31) {
                res <<= 1;
            }
        }
        return res;
    }
}
