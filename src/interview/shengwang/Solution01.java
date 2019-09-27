package interview.shengwang;

        import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/9/26 18:36
 */
public class Solution01 {

    public static void main(String[] args) {
        int kth = new Solution01().findKth(new int[]{1, 3, 5, 2, 2}, 5, 3);
        System.out.println(kth);
    }

    public int findKth(int[] a, int n, int K) {
        // write code here
        Arrays.sort(a);
        return a[n - K];
    }
}
