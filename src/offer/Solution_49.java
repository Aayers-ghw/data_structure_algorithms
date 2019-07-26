package offer;

/**
 * @author Aayers-ghw
 * @date 2019/7/23 20:41
 */
public class Solution_49 {
    public static int getUglyNumberSolution(int index) {
        if (index < 1) {
            return 0;
        }
        int m2 = 2;
        int m3 = 3;
        int m5 = 5;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int[] count = new int[index];
        count[0] = 1;
        for (int i = 1; i < index; ++i) {
            count[i] = Math.min(m2 * count[i2], Math.min(m3 * count[i3], m5 * count[i5]));
            if (count[i] == m2 * count[i2]) {
                i2++;
            }
            if (count[i] == m3 * count[i3]) {
                i3++;
            }
            if (count[i] == m5 * count[i5]) {
                i5++;
            }
        }
        return count[index - 1];
    }

    public static void main(String[] args) {
        int res = getUglyNumberSolution(11);
        System.out.println(res);
    }
}
