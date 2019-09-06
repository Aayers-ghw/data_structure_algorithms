package leetcode800;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/9/6 9:08
 */
public class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; ++i) {
            cars[i] = new double[]{position[i], (double)(target - position[i]) / speed[i]};
        }
        Arrays.sort(cars);
        double cur = 0;
        int res = 0;
        for (int i = n - 1; i >= 0; --i) {
            if (cars[i][1] > cur) {
                cur = cars[i][1];
                res++;
            }
        }
        return res;
    }
}
