package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 11:19
 */
public class Result {

    /**
     * 我们现在有四个槽，每个槽放一个球，颜色可能是红色(R)、黄色(Y)、绿色(G)或蓝色(B)。
     * 例如，可能的情况为RGGB(槽1为红色，槽2、3为绿色，槽4为蓝色)，作为玩家，你需要试图猜出颜色的组合。
     * 比如，你可能猜YRGB。要是你猜对了某个槽的颜色，则算一次“猜中”。要是只是猜对了颜色但槽位猜错了，则算一次“伪猜中”。
     * 注意，“猜中”不能算入“伪猜中”。
     * <p>
     * 给定两个string A和guess。分别表示颜色组合，和一个猜测。
     * 请返回一个int数组，第一个元素为猜中的次数，第二个元素为伪猜中的次数。
     *
     * @param A
     * @param guess
     * @return
     */
    public int[] calcResult(String A, String guess) {
        // write code here
        int[] res = new int[2];
        char[] charsA = A.toCharArray();
        char[] charsG = guess.toCharArray();
        for (int i = 0; i < charsA.length; ++i) {
            if (charsA[i] == charsG[i]) {
                res[0]++;
                charsA[i] = '0';
                charsG[i] = '0';
            }
        }
        for (int i = 0; i < charsA.length; ++i) {
            if (charsA[i] == '0') {
                continue;
            }
            for (int j = 0; j < charsG.length; ++j) {
                if (charsA[i] == charsG[j]) {
                    res[1]++;
                    charsG[j] = '0';
                    break;
                }
            }
        }
        return res;
    }
}
