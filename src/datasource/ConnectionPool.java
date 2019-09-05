package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

/**
 * ���ݿ����ӳ�
 * 1.��ʼ�����ӳ�
 * ���ݳ�ʼ�����������������ӷŵ����г���
 * 2.������ȡ����getConnection����
 * �ж��Ƿ�С�����������
 * С��==���жϿ������ӳ��Ƿ��������
 * ��==��ֱ��ȡ���ŵ�����ӳ��У�Ȼ��������ӳ�ɾ��
 * ��==�������µ����ӣ��ŵ�����ӳ���
 * ����==���ȴ�������
 *
 * @author Aayers-ghw
 * @date 2019/9/5 16:16
 */
public class ConnectionPool {

    /**
     * ʹ���̰߳�ȫ�ļ��� �����߳� ���� û�б�ʹ�õ����Ӵ��
     */
    private List<Connection> freeConnection = new Vector<>();

    /**
     * ʹ���̰߳�ȫ�ļ��� ��߳� ���� ��������ʹ�õ�����
     */
    private List<Connection> activeConnection = new Vector<>();

    private DbBean dbBean;

    private volatile int connNum = 0;

    /**
     * ͨ�����캯����ʼ�����ӳ�
     */
    public ConnectionPool(DbBean dbBean) {
        //��ȡ�����ļ���Ϣ
        this.dbBean = dbBean;
        //1.��ʼ�����ӳ�
        for (int i = 0; i < dbBean.getInitConnections(); ++i) {
            Connection connection = newConnect();
            if (connection != null) {
                //�ŵ��������ӳ���
                freeConnection.add(connection);
            }
        }
    }

    /**
     * 2.������ȡ����getConnection����
     * �ж��Ƿ�С�����������
     * С��==���жϿ������ӳ��Ƿ��������
     * ��==��ֱ��ȡ���ŵ�����ӳ��У�Ȼ��������ӳ�ɾ��
     * ��==�������µ����ӣ��ŵ�����ӳ���
     * ����==���ȴ�������
     * 3.�ͷ����� ����
     * �ж������Ƿ����
     * ==>�жϿ����߳��Ƿ�����
     * û��==���������ӣ��ŵ������̳߳���
     * ����==���ر�����
     * ����ӳ��Ƴ�������
     */
    public synchronized Connection getConnection() {
        Connection connection = null;
        //�ж��Ƿ�С�����������
        if (connNum <= dbBean.getMaxActiveConnections()) {
            //�жϿ������ӳ��Ƿ��������
            if (freeConnection.size() > 0) {
                //�������ӳ�ɾ��
                connection = freeConnection.remove(0);
            } else {
                //�����µ�����
                connection = newConnect();
            }
            //������ӳؿ���
            if (isAvailable(connection)) {
                //�ŵ�����ӳ���
                activeConnection.add(connection);
            } else {
                //������ʧЧ
                connNum--;
                //�ظ�����
                connection = getConnection();
            }
        } else {
            // ������������������еȴ�
            try {
                wait(dbBean.getConnTimeOut());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // ����
            connection = getConnection();
        }
        return connection;
    }

    /**
     * ��������
     *
     * @return
     */
    private synchronized Connection newConnect() {
        Connection connection = null;
        try {
            Class.forName(dbBean.getDriverName());
            connection = DriverManager.getConnection(dbBean.getUrl(), dbBean.getUserName(), dbBean.getPassword());
            //��¼������
            connNum++;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * �ж������Ƿ����
     *
     * @param connection
     * @return
     */
    public boolean isAvailable(Connection connection) {
        try {
            if (connection == null || connection.isClosed()) {
                return false;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return true;
    }

    /**
     * 3.�ͷ����� ����
     * �ж������Ƿ����
     * ==>�жϿ����߳��Ƿ�����
     * û��==���������ӣ��ŵ������̳߳���
     * ����==���ر�����
     * ����ӳ��Ƴ�������
     */
    public synchronized void releaseConnection(Connection connection) {
        //�ж������Ƿ����
        if (isAvailable(connection)) {
            //�жϿ����߳��Ƿ�����
            if (freeConnection.size() < dbBean.getMaxConnections()) {
                // �����߳�û����,��������
                freeConnection.add(connection);
            } else {
                // �����߳��Ѿ���
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //����ӳ��Ƴ�������
            activeConnection.remove(connection);
            //��������һ
            connNum--;
            notifyAll();
        }
    }
}
