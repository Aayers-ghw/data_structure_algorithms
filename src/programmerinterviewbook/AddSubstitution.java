package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 14:31
 */
public class AddSubstitution {

    /**
     * ���дһ��������ʵ�������ĳ˷��������ͳ�������(����ĳ�ָ����)��ֻ����ʹ�üӺš�
     * <p>
     * ��������������int a,int b,ͬʱ����һ��int type������������ͣ�1Ϊ��a �� b��0Ϊ��a �� b��-1Ϊ��a �� b��
     * �뷵�ؼ���Ľ������֤���ݺϷ��ҽ��һ����int��Χ�ڡ�
     *
     * @param a
     * @param b
     * @param type
     * @return
     */
    public int calc(int a, int b, int type) {
        // write code here
        int res = 0;
        switch (type) {
            case 1: {
                res = mult(a, b);
                break;
            }
            case 0: {
                res = div(a, b);
                break;
            }
            case -1: {
                res = sub(a, b);
                break;
            }
            default:
        }
        return res;
    }

    public int mult(int a, int b) {
        int r = 0;
        for (int i = 0; i < a; i++) {
            r += b;
        }
        return r;
    }

    public int div(int a, int b) {
        for (int i = 1; i <= a; ++i) {
            if (mult(i, b) <= a && mult(i + 1, b) > a) {
                return i;
            }
        }
        return 0;
    }

    public int sub(int a, int b) {
        if (a >= b) {
            for (int i = 1; i <= a; ++i) {
                if (a == b + i) {
                    return i;
                }
            }
        }
        return mult(sub(b, a), -1);
    }
}
