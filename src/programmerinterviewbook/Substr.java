package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 21:18
 */
public class Substr {

    /**
     * 现有一个小写英文字母组成的字符串s和一个包含较短小写英文字符串的数组p，请设计一个高效算法，
     * 对于p中的每一个较短字符串，判断其是否为s的子串。
     * <p>
     * 给定一个string数组p和它的大小n，同时给定string s，为母串，请返回一个bool数组，每个元素代表p中的对应字符串是否为s的子串。
     * 保证p中的串长度小于等于8，且p中的串的个数小于等于500，同时保证s的长度小于等于1000。
     *
     * @param p
     * @param n
     * @param s
     * @return
     */
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        if (p == null || p.length == 0) {
            return new boolean[]{};
        }
        boolean[] res = new boolean[n];
        for (int i = 0; i < p.length; ++i) {
            if (s.contains(p[i])) {
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        return res;
    }
}
