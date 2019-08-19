package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 10:56
 */
public class BinDecimal {
    /**
     * ��һ������0��1֮���ʵ��������Ϊdouble���������Ķ����Ʊ�ʾ��
     * ����������޷���ȷ����32λ���ڵĶ����Ʊ�ʾ�����ء�Error����
     * <p>
     * ����һ��double num����ʾ0��1��ʵ�����뷵��һ��string����������Ķ����Ʊ�ʾ���ߡ�Error����
     *
     * @param num
     * @return
     */
    public String printBin(double num) {
        // write code here
        StringBuilder sb = new StringBuilder("0.");
        for (int i = 0; i < 32; ++i) {
            num = num * 2;
            if (num >= 1) {
                sb.append(1);
                num -= 1;
            } else {
                sb.append(0);
            }
            if (num == 0) {
                return sb.toString();
            }
        }
        return "Error";
    }
}
