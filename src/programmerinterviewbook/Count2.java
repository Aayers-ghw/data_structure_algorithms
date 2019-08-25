package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 13:31
 */
public class Count2 {

    /**
     * ���дһ�����������0��n(����n)������2�����˼��Ρ�
     * <p>
     * ����һ��������n���뷵��0��n��������2�����˼��Ρ�
     *
     * @param n
     * @return
     */
    public int countNumberOf2s(int n) {
        if (n < 1) {
            return 0;
        }
        int cnt = 0;
        for (int i = 1; i <= n; i *= 10) {
            int tmp1 = n / i;
            int tmp2 = n % i;
            cnt += (tmp1 + 7) / 10 * i + ((tmp1 % 10 == 2) ? tmp2 + 1 : 0);
        }
        return cnt;
    }
}
