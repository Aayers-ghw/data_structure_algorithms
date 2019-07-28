package singleton;

/**
 * ����ģʽ���̲߳���ȫ��
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:17
 */
public class Singleton2 {
    /**
     * ����ģʽ������һ����̬�������û���һ�ε���ʱ��ʼ����
     * ��Ȼ��Լ����Դ������һ�μ���ʱ��Ҫʵ��������ӳ����һЩ�������ڶ��̲߳�������������
     */
    private static Singleton2 instance;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
