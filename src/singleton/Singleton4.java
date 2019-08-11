package singleton;

/**
 * ˫�ؼ��ģʽ ��DCL��
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:22
 */
public class Singleton4 {

    /**
     * ���� volatile �ؼ�������Ҳ�Ǻ��б�Ҫ�ģ� instance = new Singleton(); ��δ�����ʵ�Ƿ�Ϊ����ִ�У�
     * <p>
     * 1.Ϊ uniqueInstance �����ڴ�ռ�
     * 2.��ʼ�� uniqueInstance
     * 3.�� uniqueInstance ָ�������ڴ��ַ
     * <p>
     * ʹ�� volatile ���Խ�ֹ JVM ��ָ�����ţ���֤�ڶ��̻߳�����Ҳ���������С�
     */
    private static volatile Singleton4 instance;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
