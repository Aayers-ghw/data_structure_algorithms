package leetcodetop100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/7 10:41
 */
public class FindAllAnagramsInaString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return res;
        }
        int[] map = new int[256];
        int left = 0;
        int right = 0;
        int count = p.length();
        char[] sc = s.toCharArray();
        for (char ch : p.toCharArray()) {
            map[ch]++;
        }
        while (right < s.length()) {
            if (map[sc[right++]]-- > 0) {
                count--;
            }
            if (count == 0) {
                res.add(left);
            }
            if (right - left == p.length() && map[sc[left++]]++ >= 0) {
                count++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> anagrams = new FindAllAnagramsInaString().findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams);
    }
}
