package singleton;

/**
 * ��̬�ڲ��൥��ģʽ
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:42
 */
public class Singleton5 {

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton5 sInstance = new Singleton5();
    }
}
