package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 9:07
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n < 1) {
            return "";
        }
        String res = "1";
        while (--n > 0) {
            StringBuilder cur = new StringBuilder();
            for (int i = 0; i < res.length(); ++i) {
                int cnt = 1;
                while (i + 1 < res.length() && (res.charAt(i) == res.charAt(i + 1))) {
                    cnt++;
                    i++;
                }
                cur.append(cnt).append(res.charAt(i));
            }
            res = cur.toString();
        }
        return res;
    }
}
