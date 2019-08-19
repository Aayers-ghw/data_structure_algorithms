package programmerinterviewbook;

import programmerinterviewbook.util.Point;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 15:34
 */
public class DenseLine {

    /**
     * 在二维平面上，有一些点，请找出经过点数最多的那条线。
     * <p>
     * 给定一个点集vector<point>p和点集的大小n,没有两个点的横坐标相等的情况,
     * 请返回一个vector<double>，代表经过点数最多的那条直线的斜率和截距。</double></point>
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
