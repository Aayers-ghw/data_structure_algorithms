package programmerinterviewbook;

import programmerinterviewbook.util.Point;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 15:34
 */
public class DenseLine {

    /**
     * �ڶ�άƽ���ϣ���һЩ�㣬���ҳ������������������ߡ�
     * <p>
     * ����һ���㼯vector<point>p�͵㼯�Ĵ�Сn,û��������ĺ�������ȵ����,
     * �뷵��һ��vector<double>��������������������ֱ�ߵ�б�ʺͽؾࡣ</double></point>
     *
     * @param p
     * @param n
     * @return
     */
    public double[] getLine(Point[] p, int n) {
        // write code here
        int max = Integer.MIN_VALUE;
        double[] res = new double[2];
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int k = (p[i].y - p[j].y) / (p[i].x - p[j].x);
                int b = p[i].y - k * p[i].x;
                int cnt = 0;
                for (int l = 0; l < n; ++l) {
                    if (k == (p[i].y - p[j].y) / (p[i].x - p[j].x)) {
                        cnt++;
                    }
                }
                if (max < cnt) {
                    max = cnt;
                    res[0] = k;
                    res[1] = b;
                }
            }
        }
        return res;
    }
}
