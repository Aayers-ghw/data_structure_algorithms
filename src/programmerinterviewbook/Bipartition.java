package programmerinterviewbook;

import programmerinterviewbook.util.Point;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 14:53
 */
public class Bipartition {

    /**
     * �ڶ�άƽ���ϣ������������Σ����ҳ�һ��ֱ�ߣ��ܹ��������������ζ԰�֡��ٶ������ε�������������x��ƽ�С�
     * <p>
     * ��������vecotrA��B���ֱ�Ϊ���������ε��ĸ����㡣�뷵��һ��vector�����������ƽ��ֱ�ߵ�б�ʺͽؾ࣬��֤б�ʴ��ڡ�
     * <p>
     * ˼·��ֱ�Ӽ���ͺ���,��Ϊ��ƽ���������ε�ֱ�߱�Ȼ�������������ε����ĵ�
     * ��������������ĵ��λ�ã����õ���λ��
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
        //б��
        double k = (y1 - y2) / (x1 - x2);
        //�ؾ�
        double b = y1 - k * x1;
        return new double[]{k, b};
    }
}
