package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 15:26
 */
public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < heights.length; ++i) {
            int minH = heights[i];
            for (int j = i; j >= 0; --j) {
                minH = Math.min(minH, heights[j]);
                int area = minH * (i - j + 1);
                res = Math.max(res, area);
            }
        }
        return res;
    }
}
