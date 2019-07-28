package singleton;

/**
 * ����ģʽ���̰߳�ȫ��
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:18
 */
public class Singleton3 {
    /**
     * ����д���ܹ��ڶ��߳��кܺõĹ���������ÿ�ε���getInstance����ʱ����Ҫ����ͬ����
     * ��ɲ���Ҫ��ͬ�����������Ҵ󲿷�ʱ���������ò���ͬ���ģ����Բ�����������ģʽ��
     */
    private static Singleton3 instance;

    private Singleton3() {

    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
