package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:17
 */
public class Joseph {

    /**
     * Լɪ��������һ���ǳ�������Ȥ�⣬����n��������һȦ����˳ʱ����1��ʼ�����Ǳ�š�
     * Ȼ���ɵ�һ���˿�ʼ����������m���˳��֡�������Ҫ��������һ�����ֵ��˵ı�š�
     * <p>
     * ��������int n��m��������Ϸ���������뷵�����һ�����ֵ��˵ı�š���֤n��mС�ڵ���1000��
     *
     * @param n
     * @param m
     * @return
     */
    public int getResult(int n, int m) {
        // write code here
        if (n < 0 || m < 0) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; ++i) {
            last = (last + m) % i;
        }
        return last + 1;
    }
}
