package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 14:18
 */
public class CrossLine {

    /**
     * ����ֱ������ϵ�ϵ�����ֱ�ߣ�ȷ��������ֱ�߻᲻���ཻ��
     * <p>
     * �߶���б�ʺͽؾ����ʽ��������double s1��double s2��double y1��double y2��
     * �ֱ����ֱ��1��2��б��(��s1,s2)�ͽؾ�(��y1,y2)���뷵��һ��bool��
     * �������������ֱ���Ƿ��ཻ��������ֱ���غ�Ҳ��Ϊ�ཻ��
     *
     * @param s1
     * @param s2
     * @param y1
     * @param y2
     * @return
     */
    public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
        boolean flag = Math.abs(s1 - s2) < 1e-6 && Math.abs(y1 - y2) > 1e-6;
        if (flag) {
            return false;
        }
        return true;
    }
}
