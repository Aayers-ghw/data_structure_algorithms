package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/7/29 9:57
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int tmp = ((Math.min(height[left], height[right]) * (right - left)));
            ans = Math.max(ans, tmp);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return ans;
    }
}
