package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 10:34
 */
public class ReverseEqual {

    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if ((s1 == null && s2 == null) || (s1.length() == 0 && s2.length() == 0)) {
            return true;
        }
        if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        String tmp = s1 + s1;
        if (tmp.contains(s2)) {
            return true;
        }
        return false;
    }
}
