package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:26
 */
public class Reverse {

    /**
     * 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
     * <p>
     * 给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
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
