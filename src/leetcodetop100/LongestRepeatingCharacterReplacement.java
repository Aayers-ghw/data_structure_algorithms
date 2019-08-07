package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/7 12:09
 */
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] map = new int[26];
        int res = 0;
        int left = 0;
        int maxCnt = 0;
        for (int end = 0; end < s.length(); ++end){
            maxCnt = Math.max(maxCnt, ++map[s.charAt(end) - 'A']);
            while (end - left + 1 - maxCnt > k) {
                map[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, end - left + 1);
        }
        return res;
    }
}
