package test;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 10:32
 */
public class Outer {

    public void doSomeThink() {
        System.out.println("do");
    }
    public class Inner {

    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.new Inner();
    }
}
