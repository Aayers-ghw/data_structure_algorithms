package interview.laohu;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 17:27
 */
public class Solution02 {

    public String solution(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == 'L') {
                if (i == 1 && chars[i - 1] == '.') {
                    chars[0] = 'L';
                } else {
                    while (i - 2 >= 0 && chars[i - 1] == '.' && chars[i - 2] != 'R') {
                        chars[i - 1] = 'L';
                    }
                }
            } else if (chars[i] == 'R') {
                while (i + 3 < chars.length && chars[i + 1] == '.' && chars[i + 3] != 'L') {
                    chars[i + 1] = 'R';
                }
            }
        }
        return new String(chars);
    }

}
