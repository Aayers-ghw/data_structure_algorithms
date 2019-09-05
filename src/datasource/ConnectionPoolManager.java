package datasource;

import java.sql.Connection;

/**
 * 管理连接池
 *
 * @author Aayers-ghw
 * @date 2019/9/5 16:35
 */
public class ConnectionPoolManager {

    private static DbBean dbBean = new DbBean();
    private static ConnectionPool connectionPool = new ConnectionPool(dbBean);

    /**
     * 获取连接(重复利用机制)
     *
     * @return
     */
    public static Connection getConnection() {
        return connectionPool.getConnection();
    }

    /**
     * 释放连接(可回收机制)
     *
     * @param connection
     */
    public static void releaseConnection(Connection connection) {
        connectionPool.releaseConnection(connection);
    }
}
