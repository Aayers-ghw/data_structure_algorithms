package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/6 10:38
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) {
            return new int[0];
        }
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; ++i) {
            int count = 0;
            int j;
            for (j = i + 1; j < T.length; ++j) {
                count++;
                if (T[j] > T[i]) {
                    break;
                }
            }
            if (j == T.length) {
                res[i] = 0;
            } else {
                res[i] = count;
            }
        }
        return res;
    }
}
