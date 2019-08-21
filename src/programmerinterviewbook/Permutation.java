package programmerinterviewbook;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Aayers-ghw
 * @date 2019/8/21 9:18
 */
public class Permutation {

    /**
     * ��дһ��������ȷ��ĳ�ַ���������������ϡ�
     * <p>
     * ����һ��string A��һ��int n,�����ַ������䳤�ȣ��뷵�����и��ַ����ַ������У�
     * ��֤�ַ�������С�ڵ���11���ַ������ַ���Ϊ��дӢ���ַ��������е��ַ������ֵ���Ӵ�С����(���ϲ��ظ��ַ���)
     *
     * @param A
     * @return
     */
    public ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        if (A == null || A.length() == 0) {
            return res;
        }
        dfs(res, A.toCharArray(), 0);
        Collections.sort(res);
        Collections.reverse(res);
        return res;
    }

    public void dfs(ArrayList<String> res, char[] chars, int start) {
        if (start == chars.length) {
            res.add(new String(chars));
            return;
        }
        for (int i = start; i < chars.length; ++i) {
            swap(chars, start, i);
            dfs(res, chars, start + 1);
            swap(chars, start, i);
        }
    }

    public void swap(char[] chars, int i, int j) {
        char ch = chars[i];
        chars[i] = chars[j];
        chars[j] = ch;
    }
}
