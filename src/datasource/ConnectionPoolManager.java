package datasource;

import java.sql.Connection;

/**
 * �������ӳ�
 *
 * @author Aayers-ghw
 * @date 2019/9/5 16:35
 */
public class ConnectionPoolManager {

    private static DbBean dbBean = new DbBean();
    private static ConnectionPool connectionPool = new ConnectionPool(dbBean);

    /**
     * ��ȡ����(�ظ����û���)
     *
     * @return
     */
    public static Connection getConnection() {
        return connectionPool.getConnection();
    }

    /**
     * �ͷ�����(�ɻ��ջ���)
     *
     * @param connection
     */
    public static void releaseConnection(Connection connection) {
        connectionPool.releaseConnection(connection);
    }
}
