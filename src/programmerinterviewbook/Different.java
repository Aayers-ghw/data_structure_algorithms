package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:24
 */
public class Different {

    /**
     * ��ʵ��һ���㷨��ȷ��һ���ַ����������ַ��Ƿ�ȫ����ͬ����������Ҫ������ʹ�ö���Ĵ洢�ṹ��
     * <p>
     * ����һ��string iniString���뷵��һ��boolֵ,True���������ַ�ȫ����ͬ��False���������ͬ���ַ���
     * ��֤�ַ����е��ַ�ΪASCII�ַ����ַ����ĳ���С�ڵ���3000��
     *
     * @param iniString
     * @return
     */
    public boolean checkDifferent(String iniString) {
        // write code here
        if (iniString.length() > 256) {
            return false;
        }
        for (int i = 0; i < iniString.length(); ++i) {
            for (int j = i + 1; j < iniString.length(); ++j) {
                if (iniString.charAt(i) == iniString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
