package test;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 9:19
 */
public class Test {

    public static void main(String[] args) {
//        int i = new Test().test();
//        System.out.println(i);
//        String s = new String("hello");
//        String t = new String("hello");
//        char[] c = new char[]{'h', 'e', 'l', 'l', 'o'};
        String a = "a";
        String b = "b";
        String c = a + b;
        System.out.println(c == "a" + "b");
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
