package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 9:38
 */
public class MagicIndexII {

    /**
     * 在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。给定一个不下降序列，
     * 元素值可能相同，编写一个方法，判断在数组A中是否存在魔术索引。请思考一种复杂度优于o(n)的方法。
     * <p>
     * 给定一个int数组A和int n代表数组大小，请返回一个bool，代表是否存在魔术索引。
     *
     * @param A
     * @param n
     * @return
     */
    public boolean findMagicIndex(int[] A, int n) {
        // write code here
        if (A == null || A.length == 0) {
            return false;
        }
        for (int i = 0; i < n; ) {
            if (A[i] == i) {
                return true;
            } else {
                if (A[i] < i) {
                    i++;
                } else {
                    i = A[i];
                }
            }
        }
        return false;
    }
}
