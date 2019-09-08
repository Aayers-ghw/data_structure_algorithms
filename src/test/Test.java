package test;

import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 9:19
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("`l;`` 1o1 ??;l`".toLowerCase());
//        int i = 20;
//        float j = 14.23F;
//        System.out.println("res:" + j + i);
//        Person person = new Child();
//        System.out.println(person.name);
//        Queue queue = new SynchronousQueue();
//        queue.offer("1");
//        queue.offer("2");
//        queue.offer("3");
//        System.out.println(queue.size());

//        int i = new Test().test();
//        System.out.println(i);
//        String s = new String("hello");
//        String t = new String("hello");
//        char[] c = new char[]{'h', 'e', 'l', 'l', 'o'};
//        String a = "a";
//        String b = "b";
//        String c = a + b;
//        System.out.println(c == "a" + "b");

//        for (int i = 0; i < 10; ++i) {
//            System.out.println(Math.round(Math.random() * 10));
//        }

//        System.out.println(-1 >>> 1 & 2);
    }

    public int test() {
        int i = 10;
        try {
            i = i / 0;
        } catch (Exception e) {
            --i;
            return i--;
        } finally {
            --i;
            return i--;
        }
    }
}

class Person {
    private String name = "xiaoming";
}
class Child extends Person {
    public Child() {

    }
}