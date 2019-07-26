package july.string;

import java.util.HashMap;
import java.util.Map;

/**
 * �ַ�������
 *
 * @author Aayers-ghw
 * @date 2019/7/26 11:19
 */
public class Solution02 {
    /**
     * ���������ֱ�����ĸ��ɵ��ַ���A���ַ���B���ַ���B�ĳ��ȱ��ַ���A�̡�
     * ���ʣ���������ж��ַ���B��������ĸ�Ƿ����ַ���A�
     *
     * @param a
     * @param b
     * @return
     */
    public boolean StringContain(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Map<Character, Integer> map = new HashMap<>(a.length());
        for (char ch : aa) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : bb) {
            if (map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
