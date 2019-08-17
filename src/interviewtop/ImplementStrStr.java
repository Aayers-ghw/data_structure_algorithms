package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 8:50
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < haystack.length(); ++i) {
            int temp = i;
            if (haystack.charAt(i) == needle.charAt(j)) {
                while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                }
                if (j == needle.length()) {
                    return i - j;
                } else {
                    j = 0;
                    i = temp;
                }
            }
        }
        return -1;
    }
}
