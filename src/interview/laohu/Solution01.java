package interview.laohu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 16:23
 */
public class Solution01 {

    public int solution(String str) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                StringBuilder sb = new StringBuilder();
                int j = i;
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    if (j == i && str.charAt(i) == '0') {
                        sb.append(0);
                        break;
                    }
                    sb.append(str.charAt(i));
                    i++;
                }
                int key = Integer.parseInt(sb.toString());
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        int maxIndex = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxIndex = entry.getKey();
            }
        }
        return maxIndex * maxValue;
    }
}
