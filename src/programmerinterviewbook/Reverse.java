package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:26
 */
public class Reverse {

    /**
     * ��ʵ��һ���㷨���ڲ�ʹ�ö������ݽṹ�ʹ���ռ������£���תһ���������ַ���(����ʹ�õ������̱���)��
     * <p>
     * ����һ��string iniString���뷵��һ��string��Ϊ��ת����ַ�������֤�ַ����ĳ���С�ڵ���5000��
     *
     * @param iniString
     * @return
     */
    public String reverseString(String iniString) {
        // write code here
        char[] chars = iniString.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            swap(chars, left++, right--);
        }
        return new String(chars);
    }

    public static void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}
