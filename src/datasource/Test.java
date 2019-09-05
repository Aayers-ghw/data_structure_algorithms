package datasource;

import java.sql.Connection;

/**
 * ≤‚ ‘
 *
 * @author Aayers-ghw
 * @date 2019/9/5 16:36
 */

public class Test {
    public static void main(String[] args) {
        ThreadConnection threadConnection = new ThreadConnection();
        for (int i = 1; i < 3; i++) {
            Thread thread = new Thread(threadConnection, "œﬂ≥Ãi:" + i);
            thread.start();
        }
    }
}

class ThreadConnection implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Connection connection = ConnectionPoolManager.getConnection();
            System.out.println(Thread.currentThread().getName() + ",connection:" + connection);
            ConnectionPoolManager.releaseConnection(connection);
        }
    }
}