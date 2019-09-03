package july.string;

/**
 * 旋转字符串
 *
 * @author Aayers-ghw
 * @date 2019/7/26 11:15
 */
public class Solution01 {
    /**
     * 给定一个字符串，要求把字符串前面的若干个字符移动到字符串的尾部，
     * 如把字符串“abcdef”前面的2个字符'a'和'b'移动到字符串的尾部，使得原字符串变成字符串“cdefab”。
     * 请写一个函数完成此功能，要求对长度为n的字符串操作的时间复杂度为 O(n)，空间复杂度为 O(1)。
     */
    public void leftRotateString(char[] chars, int n, int m) {
        m %= n;
        reverseString(chars, 0, m - 1);
        reverseString(chars, m , n - 1);
        reverseString(chars, 0 ,n - 1);
    }

    private void reverseString(char[] chars, int from, int to) {
        while (from < to) {
            char ch = chars[from];
            chars[from] = chars[to];
            chars[to] = ch;
        }
    }
}
