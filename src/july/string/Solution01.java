package july.string;

/**
 * ��ת�ַ���
 *
 * @author Aayers-ghw
 * @date 2019/7/26 11:15
 */
public class Solution01 {
    /**
     * ����һ���ַ�����Ҫ����ַ���ǰ������ɸ��ַ��ƶ����ַ�����β����
     * ����ַ�����abcdef��ǰ���2���ַ�'a'��'b'�ƶ����ַ�����β����ʹ��ԭ�ַ�������ַ�����cdefab����
     * ��дһ��������ɴ˹��ܣ�Ҫ��Գ���Ϊn���ַ���������ʱ�临�Ӷ�Ϊ O(n)���ռ临�Ӷ�Ϊ O(1)��
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
