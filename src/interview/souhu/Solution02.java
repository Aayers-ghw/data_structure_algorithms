package interview.souhu;

/**
 * @author Aayers-ghw
 * @date 2019/9/25 18:44
 */
public class Solution02 {

    static int count = 0;
    static Object object = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        t1.start();
        Thread t2 = new Thread(new T2());
        t2.start();
    }

    static class T1 implements Runnable {
        @Override
        public void run() {
            synchronized (object) {
                for (int i = 1; i <= 51; ++i) {
                    if (count % 2 != 0) {
                        System.out.print(i);
                        count++;
                    } else {
                        try {
                            object.wait();
                            object.notifyAll();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class T2 implements Runnable {

        @Override
        public void run() {
            synchronized (object) {
                for (int i = 0; i < 26; ++i) {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    char ch = (char)('A' + i);
                    System.out.println(ch);
                    object.notifyAll();
                }
            }
        }
    }
}
