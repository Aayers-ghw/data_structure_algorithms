package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 11:19
 */
public class Result {

    /**
     * �����������ĸ��ۣ�ÿ���۷�һ������ɫ�����Ǻ�ɫ(R)����ɫ(Y)����ɫ(G)����ɫ(B)��
     * ���磬���ܵ����ΪRGGB(��1Ϊ��ɫ����2��3Ϊ��ɫ����4Ϊ��ɫ)����Ϊ��ң�����Ҫ��ͼ�³���ɫ����ϡ�
     * ���磬����ܲ�YRGB��Ҫ����¶���ĳ���۵���ɫ������һ�Ρ����С���Ҫ��ֻ�ǲ¶�����ɫ����λ�´��ˣ�����һ�Ρ�α���С���
     * ע�⣬�����С��������롰α���С���
     * <p>
     * ��������string A��guess���ֱ��ʾ��ɫ��ϣ���һ���²⡣
     * �뷵��һ��int���飬��һ��Ԫ��Ϊ���еĴ������ڶ���Ԫ��Ϊα���еĴ�����
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
