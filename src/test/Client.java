package test;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 20:59
 */
public class Client {

    public static void main(String[] args) {
        A a = new B();
        a.foo();
        C c = (C)a;
        try {
            c.foo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
