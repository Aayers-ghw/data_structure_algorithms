package datasource;

/**
 * �ⲿ�����ļ���Ϣ
 *
 * @author Aayers-ghw
 * @date 2019/9/5 16:11
 */
public class DbBean {

    private String driverName = "com.mysql.jdbc.Driver";

    private String url = "jdbc:mysql://localhost:3306/test";

    private String userName = "root";

    private String password = "root";

    /**
     * ���ӳ�����
     */
    private String poolName = "DbBeanPool";

    /**
     * ���гأ���С������
     */
    private int minConnections = 1;

    private int maxConnections = 10; // ���гأ����������

    private int initConnections = 5;// ��ʼ��������

    private long waitTimeOut = 1000;// �ظ�������ӵ�Ƶ��

    private int maxActiveConnections = 100;// ���������������������ݿ��Ӧ

    private long connectionTimeOut = 1000 * 60 * 20;// ���ӳ�ʱʱ�䣬Ĭ��20����

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public int getMinConnections() {
        return minConnections;
    }

    public void setMinConnections(int minConnections) {
        this.minConnections = minConnections;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public int getInitConnections() {
        return initConnections;
    }

    public void setInitConnections(int initConnections) {
        this.initConnections = initConnections;
    }

    public long getConnTimeOut() {
        return waitTimeOut;
    }

    public void setConnTimeOut(long waitTimeOut) {
        this.waitTimeOut = waitTimeOut;
    }

    public int getMaxActiveConnections() {
        return maxActiveConnections;
    }

    public void setMaxActiveConnections(int maxActiveConnections) {
        this.maxActiveConnections = maxActiveConnections;
    }

    public long getConnectionTimeOut() {
        return connectionTimeOut;
    }

    public void setConnectionTimeOut(long connectionTimeOut) {
        this.connectionTimeOut = connectionTimeOut;
    }
}
