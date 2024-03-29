package singleton;

/**
 * 懒汉模式（线程不安全）
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:17
 */
public class Singleton2 {
    /**
     * 懒汉模式申明了一个静态对象，在用户第一次调用时初始化，
     * 虽然节约了资源，但第一次加载时需要实例化，反映稍慢一些，而且在多线程不能正常工作。
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
