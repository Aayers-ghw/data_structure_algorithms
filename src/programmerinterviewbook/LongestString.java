package programmerinterviewbook;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 21:04
 */
public class LongestString {

    /**
     * ��һ�鵥�ʣ����дһ���������������ҳ����������ַ�����ɵ���Ĵ�A����A��������������ɵ�(���ظ�)��ĵ��ʡ�
     * <p>
     * ����һ��string����str��ͬʱ��������Ĵ�Сn���뷵������ʵĳ��ȣ���֤��������������ʴ��ڡ�
     *
     * @param str
     * @param n
     * @return
     */
    public int getLongest(String[] str, int n) {
        // write code here
        if (str == null || str.length == 0) {
            return 0;
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            map.put(s, 1);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        for (String string : str) {
            if (canBuildWord(string, true, map)) {
                return string.length();
            }
        }
        return 0;
    }

    private boolean canBuildWord(String str, boolean isOriginal, Map<String, Integer> map) {
        if (map.containsKey(str) && !isOriginal) {
            return true;
        }
        for (int i = 1; i < str.length(); ++i) {
            String left = str.substring(0, i);
            String right = str.substring(i);
            if (map.containsKey(left) && canBuildWord(right, false, map)) {
                return true;
            }
        }
        return false;
    }
}
