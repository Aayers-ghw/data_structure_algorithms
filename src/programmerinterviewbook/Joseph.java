package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:17
 */
public class Joseph {

    /**
     * 约瑟夫问题是一个非常著名的趣题，即由n个人坐成一圈，按顺时针由1开始给他们编号。
     * 然后由第一个人开始报数，数到m的人出局。现在需要求的是最后一个出局的人的编号。
     * <p>
     * 给定两个int n和m，代表游戏的人数。请返回最后一个出局的人的编号。保证n和m小于等于1000。
     *
     * @param n
     * @param m
     * @return
     */
    public int getResult(int n, int m) {
        // write code here
        if (n < 0 || m < 0) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; ++i) {
            last = (last + m) % i;
        }
        return last + 1;
    }
}
