package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 14:12
 */
public class Ants {

    /**
     * ��n������Ķ��������nֻ���ϣ���Щ����ͬʱ��ʼ���Ŷ���εı����У��������Щ������ײ�ĸ��ʡ�
     * (�������ײ��ָ����������ֻ���ϻ���ײ)
     * <p>
     * ����һ��int n(3<=n<=10000)������n���κ�nֻ���ϣ��뷵��һ��double��Ϊ��ײ�ĸ��ʡ�
     *
     * @param n
     * @return
     */
    public double antsCollision(int n) {
        // write code here
        double ans = 1;
        for (int i = 0; i < n; ++i) {
            ans *= 0.5;
        }
        return 1 - (ans * 2);
    }
}
