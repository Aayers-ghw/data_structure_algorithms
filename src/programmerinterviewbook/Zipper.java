package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 10:02
 */
public class Zipper {

    /**
     * �����ַ��ظ����ֵĴ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ����磬�ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3����
     * ��ѹ������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
     * <p>
     * ����һ��string iniStringΪ��ѹ���Ĵ�(����С�ڵ���10000)����֤�����ַ����ɴ�СдӢ����ĸ��ɣ�
     * ����һ��string��Ϊ�����ѹ�����δ�仯�Ĵ���
     *
     * @param iniString
     * @return
     */
    public String zipString(String iniString) {
        // write code here
        if (iniString == null || iniString.length() == 0) {
            return iniString;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iniString.length(); ++i) {
            sb.append(iniString.charAt(i));
            int cnt = 1;
            char ch = iniString.charAt(i);
            while (i + 1 < iniString.length() && iniString.charAt(i + 1) == ch) {
                cnt++;
                i++;
            }
            sb.append(cnt);
        }
        return sb.length() < iniString.length() ? sb.toString() : iniString;
    }
}
