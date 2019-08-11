package singleton;

/**
 * 双重检查模式 （DCL）
 *
 * @author Aayers-ghw
 * @date 2019/7/28 15:22
 */
public class Singleton4 {

    /**
     * 采用 volatile 关键字修饰也是很有必要的， instance = new Singleton(); 这段代码其实是分为三步执行：
     * <p>
     * 1.为 uniqueInstance 分配内存空间
     * 2.初始化 uniqueInstance
     * 3.将 uniqueInstance 指向分配的内存地址
     * <p>
     * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
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
