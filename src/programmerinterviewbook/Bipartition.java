package programmerinterviewbook;

import programmerinterviewbook.util.Point;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 14:53
 */
public class Bipartition {

    /**
     * 在二维平面上，有两个正方形，请找出一条直线，能够将这两个正方形对半分。假定正方形的上下两条边与x轴平行。
     * <p>
     * 给定两个vecotrA和B，分别为两个正方形的四个顶点。请返回一个vector，代表所求的平分直线的斜率和截距，保证斜率存在。
     * <p>
     * 思路：直接计算就好了,因为能平分两正方形的直线必然经过两个正方形的中心点
     * 算出两正方形中心点的位置，即得到了位置
     *
     * @param A
     * @param B
     * @return
     */
    public double[] getBipartition(Point[] A, Point[] B) {
        // write code here
        double x1 = (A[0].x + A[1].x) / 2;
        double x2 = (B[0].x + B[2].x) / 2;
        double y1 = (A[0].y + A[2].y) / 2;
        double y2 = (B[0].y + B[2].y) / 2;
        //斜率
        double k = (y1 - y2) / (x1 - x2);
        //截距
        double b = y1 - k * x1;
        return new double[]{k, b};
    }
}
