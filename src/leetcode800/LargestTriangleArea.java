package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/9/8 9:42
 */
public class LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int[] i : points) {
            for (int[] j : points) {
                for (int[] k : points) {
                    double tmp = 0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1]- j[0] * i[1] - k[0] * j[1] - i[0] * k[1]);
                    res = Math.max(res, tmp);
                }
            }
        }
        return res;
    }
}
