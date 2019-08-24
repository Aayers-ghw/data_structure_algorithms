package interview.jingdong;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/24 19:44
 */
public class Solution01 {

    /**
     * 合唱队的N名学生站成一排且从左到右编号为1到N，其中编号为i的学生身高为Hi。
     * 现在将这些学生分成若干组（同一组的学生编号连续），并让每组学生从左到右按身高从低到高进行排列，
     * 使得最后所有学生同样满足从左到右身高从低到高（中间位置可以等高），那么最多能将这些学生分成多少组？
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        int cnt = 1;
        int tmp = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > tmp) {
                cnt++;
                tmp = nums[i];
            }
        }
        System.out.println(cnt);
    }
}
