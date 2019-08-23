package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 17:20
 */
public class UnusualAdd {

    /**
     * ���дһ��������������������ӡ�����ʹ��+�����������������
     * <p>
     * ��������int A��B���뷵��A��B��ֵ
     *
     * ˼·��
     * �����Ƽӷ�������һ���ص㡣
     * λ������������'��'�Ľ��һ�£�
     * ��� 1^1=0 1^0=1 0^0=0
     * ��� 1+1=0 1+0=1 0+0=0
     * λ�����������'��λ���Ľ��һ�£�
     * λ�� 1&1=1 1&0=0 0&0=0
     * ��λ 1+1=1 1+0=0 0+0=0
     *
     * @param A
     * @param B
     * @return
     */
    public int addAB(int A, int B) {
        // write code here
        int xor;
        int and;
        while (B != 0) {
            xor = A ^ B;
            and = A & B;
            A = xor;
            B = and << 1;
        }
        return A;
    }
}
