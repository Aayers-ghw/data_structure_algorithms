package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 11:04
 */
public class ExchangeII {

    /**
     * ���дһ�������������ڲ�ʹ���κ���ʱ������ֱ�ӽ�����������ֵ��
     * <p>
     * ����һ��int����AB��������Ԫ�غ͵�һ��Ԫ��Ϊ��������ֵ���뷵�ؽ���������顣
     *
     * @param AB
     * @return
     */
    public int[] exchangeAB(int[] AB) {
        // write code here
        if (AB == null || AB.length < 2) {
            return AB;
        }
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }
}
