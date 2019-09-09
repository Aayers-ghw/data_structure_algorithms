package test;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 12:28
 */
public class Main {

    public static void main(String[] args) {
        String str = "a,b$c";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < right && !isCh(chars, left)) {
                ++left;
            }
            while (left < right && !(isCh(chars, right))) {
                --right;
            }
            swap(chars, left, right);
            left++;
            right--;
        }
        System.out.println(new String(chars));
    }

    private static boolean isCh(char[] chars, int index) {
        return (chars[index] >= 'a' && chars[index] <= 'z') || (chars[index] >= 'A' && chars[index] <= 'Z');
    }

    private static void swap(char[] chars, int i, int j) {
        char ch = chars[i];
        chars[i] = chars[j];
        chars[j] = ch;
    }
}
