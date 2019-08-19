package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 9:47
 */
public class LCA {

    /**
     * ��һ���������������������㰴�����һ��һ��ش����������α�ţ��������Ϊ1��
     * �������������a��b�������һ���㷨�����a��b�������������ȵı�š�
     * <p>
     * ��������int a,b��Ϊ�������ı�š��뷵��a��b������������ȵı�š�ע�������㱾��Ҳ����Ϊ�������ȡ�
     *
     * @param a
     * @param b
     * @return
     */
    public int getLCA(int a, int b) {
        // write code here
        while (a != b) {
            if (a > b) {
                a = a / 2;
            } else {
                b = b / 2;
            }
        }
        return a;
    }
}
