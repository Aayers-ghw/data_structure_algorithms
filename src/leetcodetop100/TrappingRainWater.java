package leetcodetop100;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 15:00
 */
public class TrappingRainWater {

    /**
     * 方法一
     * @param height
     * @return
     */
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length;) {
            if (stack.isEmpty() || height[i] <= height[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int t = stack.pop();
                if (stack.isEmpty()) {
                    continue;
                }
                ans += (Math.min(height[stack.peek()], height[i]) - height[t]) * (i - stack.peek() - 1);
            }
        }
        return ans;
    }

    /**
     * 方法二
     * @param height
     * @return
     */
    public int trapII(int[] height) {
        int ans = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; ++i) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = i; j >= 0; --j) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < size; ++j) {
                maxRight = Math.max(maxRight, height[j]);
            }
            ans += Math.min(maxLeft, maxRight) - height[i];
        }
        return ans;
    }
}
