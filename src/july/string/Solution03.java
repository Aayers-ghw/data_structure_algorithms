package july.string;

/**
 * ╩ьндеп╤о
 *
 * @author Aayers-ghw
 * @date 2019/7/26 13:12
 */
public class Solution03 {

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome("12321"));
//        System.out.println(isPalindrome("abc"));
//        System.out.println(isPalindrome("abba"));
        boolean flag = "abcdabcd".contains("dabc");
        System.out.println(flag);
    }
}
