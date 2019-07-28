package singleton;

/**
 * 懒汉模式（线程安全）
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:18
 */
public class Singleton3 {
    /**
     * 这种写法能够在多线程中很好的工作，但是每次调用getInstance方法时都需要进行同步，
     * 造成不必要的同步开销，而且大部分时候我们是用不到同步的，所以不建议用这种模式。
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
