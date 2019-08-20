package fullpermutation;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 14:50
 */
public class PermutationSequence {

    /**
     * 给定正整数n和k，要求返回在[1,2,…,n]所有的全排列中，第k大的字符串序列。
     */
    public String getPermutation(int n, int k) {
        List<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= n; ++i) {
            nums.add(i);
        }
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; ++i) {
            fact[i] = i * fact[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        k = k - 1;
        for (int i = n; i > 0; --i) {
            int index = k / fact[i - 1];
            sb.append(nums.get(index));
            k = k % fact[i - 1];
            nums.remove(index);
        }
        return sb.toString();
    }
}
