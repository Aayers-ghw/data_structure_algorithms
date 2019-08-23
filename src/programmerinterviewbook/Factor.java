package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 13:18
 */
public class Factor {

    /**
     * �����һ���㷨������n�Ľ׳��ж��ٸ�β���㡣
     * <p>
     * ����һ��int n���뷵��n�Ľ׳˵�β���������֤nΪ��������
     * <p>
     * ˼·��
     * <p>
     * 1����n! �ֽ�����ɸ�������ˣ�ֻ�� 2*5 �ſ��ܲ���β���㣬��2 ����������5����������ת��Ϊ�����ж��ٸ�5.
     * <p>
     * 2������һ��1��n֮���м���5�ı���������Ϊn/5����Ȼ�����м���25�ı���������Ϊn/25�����������ơ�
     *
     * @param n
     * @return
     */
    public int getFactorSuffixZero(int n) {
        // write code here
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
