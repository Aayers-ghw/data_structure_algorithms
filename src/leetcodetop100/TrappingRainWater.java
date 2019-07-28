package leetcodetop100;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 15:00
 */
public class TrappingRainWater {

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
}
