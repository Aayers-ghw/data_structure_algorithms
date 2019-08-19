package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 11:12
 */
public class CloseNumber {

    /**
     * 有一个正整数，请找出其二进制表示中1的个数相同、且大小最接近的那两个数。(一个略大，一个略小)
     * <p>
     * 给定正整数int x，请返回一个vector，代表所求的两个数（小的在前）。保证答案存在。
     *
     * @param x
     * @return
     */
    public int[] getCloseNumber(int x) {
        // write code here
        int min = x - 1;
        int max = x + 1;
        while (Integer.bitCount(min) != Integer.bitCount(x) && min >= 0) {
            min--;
        }
        while (Integer.bitCount(max) != Integer.bitCount(x)) {
            max++;
        }
        return new int[]{min, max};
    }
}
