package singleton;

/**
 * ����ģʽ
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:15
 */
public class Singleton1 {
    /**
     * ���ַ�ʽ�������ʱ������˳�ʼ������������ؽ�����
     * ����ȡ������ٶȿ졣 ���ַ�ʽ��������ػ��Ʊ����˶��̵߳�ͬ�����⣬
     * ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ�
     * ��ʱ���ʼ��instance��Ȼû�дﵽ�����ص�Ч����
     */
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
