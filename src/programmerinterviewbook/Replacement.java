package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:56
 */
public class Replacement {

    /**
     * ���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20�����ٶ����ַ������㹻�Ŀռ����������ַ���
     * ����֪���ַ�������ʵ����(С�ڵ���1000)��ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ�
     * <p>
     * ����һ��string iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, �����滻���string��
     *
     * @param iniString
     * @param length
     * @return
     */
    final static String init = "%20";

    public String replaceSpace(String iniString, int length) {
        // write code here
        if (iniString == null || length == 0) {
            return iniString;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : iniString.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.append(init);
            }
        }
        return sb.toString();
    }
}
