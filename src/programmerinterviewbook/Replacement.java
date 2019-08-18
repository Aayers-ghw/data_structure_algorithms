package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:56
 */
public class Replacement {

    /**
     * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，
     * 并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
     * <p>
     * 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
     *
     * @param iniString
     * @param length
     * @return
     */
    final static String init = "%20";

    public String replaceSpace(String iniString, int length) {
        // write code here
        if (iniString == null || length == 0) {
            return iniString;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : iniString.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.append(init);
            }
        }
        return sb.toString();
    }
}
