package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 11:26
 */
public class Transform2 {

    /**
     * ��дһ��������ȷ����Ҫ�ı伸��λ�����ܽ�����Aת�������B��
     * <p>
     * ������������int A��int B���뷵����Ҫ�ı����λ������
     *
     * @param A
     * @param B
     * @return
     */
    public int calcCost(int A, int B) {
        // write code here
//        int cnt = 0;
//        int tmp = 1;
//        for (int i = 0; i < 32; ++i) {
//            if ((A & tmp) != (B & tmp)) {
//                cnt++;
//            }
//            tmp <<= 1;
//        }
//        return cnt;

        int sum = A ^ B;
        return Integer.bitCount(sum);
    }
}
