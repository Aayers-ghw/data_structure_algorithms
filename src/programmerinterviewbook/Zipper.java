package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 10:02
 */
public class Zipper {

    /**
     * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
     * 若压缩后的字符串没有变短，则返回原先的字符串。
     * <p>
     * 给定一个string iniString为待压缩的串(长度小于等于10000)，保证串内字符均由大小写英文字母组成，
     * 返回一个string，为所求的压缩后或未变化的串。
     *
     * @param iniString
     * @return
     */
    public String zipString(String iniString) {
        // write code here
        if (iniString == null || iniString.length() == 0) {
            return iniString;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iniString.length(); ++i) {
            sb.append(iniString.charAt(i));
            int cnt = 1;
            char ch = iniString.charAt(i);
            while (i + 1 < iniString.length() && iniString.charAt(i + 1) == ch) {
                cnt++;
                i++;
            }
            sb.append(cnt);
        }
        return sb.length() < iniString.length() ? sb.toString() : iniString;
    }
}
