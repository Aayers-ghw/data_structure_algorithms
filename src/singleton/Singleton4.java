package singleton;

/**
 * 双重检查模式 （DCL）
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:22
 */
public class Singleton4 {

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
