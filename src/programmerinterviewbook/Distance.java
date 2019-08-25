package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 20:57
 */
public class Distance {

    /**
     * ��һƪ�����ں�������ʣ��ָ����������ʣ������һ����Ч�㷨���ҳ��������������ʵ���̾���
     * (����������ĵ�����,Ҳ��������������������λ�õĲ�ľ���ֵ)��
     * <p>
     * ����һ��string����article�������������£�ͬʱ�������µĵ�����n�ʹ����ҵ���������x��y���뷵���������ʵ���̾��롣
     * ��֤�������ʾ������г����Ҳ���ͬ��ͬʱ��֤���µ�����С�ڵ���1000��
     *
     * @param article
     * @param n
     * @param x
     * @param y
     * @return
     */
    public int getDistance(String[] article, int n, String x, String y) {
        // write code here
        if (n <= 0) {
            return -1;
        }
        int left = 0;
        int right = 0;
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            if (article[i].equals(x)) {
                left = i;
            } else if (article[i].equals(y)){
                right = i;
            }
            if (left != 0 && right != 0) {
                minDis = Math.min(minDis, Math.abs(left - right));
            }
        }
        return minDis;
    }
}
