package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/7/25 21:40
 */
public class RestoreIPAddresses {

//    public List<String> restoreIpAddresses(String s) {
//        if (s == null || s.length() == 0) {
//            return null;
//        }
//        List<String> list = new ArrayList<>();
//        int len = s.length();
//        for (int a = 1; a < 4; ++a) {
//            for (int b = 1; b < 4; ++b) {
//                for (int c = 1; c < 4; ++c) {
//                    for (int d = 1; d < 4; ++d) {
//                        if (a + b + c + d == len) {
//                            int A = Integer.parseInt(s.substring(0, a));
//                            int B = Integer.parseInt(s.substring(a, a + b));
//                            int C = Integer.parseInt(s.substring(a + b, a + b + c));
//                            int D = Integer.parseInt(s.substring(a + b + c));
//                            if (A <= 255 && B <= 255 && C <= 255 && D <= 255) {
//                                String ss = A + "." + B + "." + C + "." + D;
//                                if (ss.length() == s.length() + 3) {
//                                    list.add(ss);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return list;
//    }

    /**
     * µÝ¹éÊµÏÖ
     * @param s
     * @return
     */
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        help(s, "", res, 4);
        return res;
    }

    public void help(String s, String tmp, List<String> res, int n) {
        if (n == 4) {
            if (s.length() == 0) {
                res.add(tmp.substring(0, tmp.length() - 1));
            }
            return;
        }
        for (int k = 1; k < 4; ++k) {
            if (s.length() < k) {
                continue;
            }
            int val = Integer.parseInt(s.substring(0, k));
            if (val > 255 || k != String.valueOf(val).length()) {
                continue;
            }
            help(s.substring(k), tmp + s.substring(0, k) + ".", res, n + 1);
        }
    }
}
