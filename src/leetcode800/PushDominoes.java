package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/9/5 10:09
 */
public class PushDominoes {

    public String pushDominoes(String dominoes) {
        dominoes = "L" + dominoes + "R";
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 1; j < dominoes.length(); ++j) {
            if (dominoes.charAt(j) == '.') {
                continue;
            }
            int mid = j - i - 1;
            if (i > 0) {
                sb.append(dominoes.charAt(i));
            }
            if (dominoes.charAt(i) == dominoes.charAt(j)) {
                for (int k = 0; k < mid; ++k) {
                    sb.append(dominoes.charAt(i));
                }
            } else if (dominoes.charAt(i) == 'L' && dominoes.charAt(j) == 'R') {
                for (int k = 0; k < mid; ++k) {
                    sb.append(".");
                }
            } else {
                for (int k = 0; k < mid / 2; ++k) {
                    sb.append("R");
                }
                if (mid % 2 == 1) {
                    sb.append(".");
                }
                for (int k = 0; k < mid / 2; ++k) {
                    sb.append("L");
                }
            }
            i = j;
        }
        return sb.toString();
    }
}
