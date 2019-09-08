package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/9/8 15:22
 */
public class ReverseWordsInaString {

    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; --i) {
            sb.append(str[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
