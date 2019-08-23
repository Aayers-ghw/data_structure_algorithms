package leetcode800;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 19:34
 */
public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        if (people == null || people.length == 0) {
            return 0;
        }
        Arrays.sort(people);
        int res = 0;
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            res++;
            right--;
        }
        return res;
    }
}
