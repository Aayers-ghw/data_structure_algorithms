package programmerinterviewbook;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 19:28
 */
public class SortString {

    /**
     * ���дһ����������һ���ַ�������������򣬽����б�λ�ʺϲ����������ֵ�����С��һ������
     * ����ı�λ��ָ�任����ĸ˳�������ɵ��µĴʻ�������"triangle"��"integral"���Ǳ�λ�ʡ�
     * <p>
     * ����һ��string������str�������Сint n���뷵������ϲ�������顣��֤�ַ�������С�ڵ���20�������СС�ڵ���300��
     *
     * @param str
     * @param n
     * @return
     */
    public ArrayList<String> sortStrings(String[] str, int n) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length == 0) {
            return res;
        }
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            char[] chars = str[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            String value = map.get(key);
            if (value == null || value.compareTo(str[i]) > 0) {
                map.put(key, str[i]);
            }
        }
        res.addAll(map.values());
        Collections.sort(res);
        return res;
    }
}
