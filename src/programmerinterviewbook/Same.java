package programmerinterviewbook;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:50
 */
public class Same {

    /**
     * ���������ַ��������д����ȷ������һ���ַ������ַ��������к��ܷ�����һ���ַ�����
     * ����涨��СдΪ��ͬ�ַ����ҿ����ַ����еĿո�
     * <p>
     * ����һ��string stringA��һ��string stringB���뷵��һ��bool�����������Ƿ��������к����ͬ��
     * ��֤�����ĳ��ȶ�С�ڵ���5000��
     *
     * @param stringA
     * @param stringB
     * @return
     */
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if (stringA == null && stringB == null || stringA.length() == 0 && stringB.length() == 0) {
            return true;
        }
        if (stringA == null || stringB == null || stringA.length() == 0 || stringB.length() == 0) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : stringA.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : stringB.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
