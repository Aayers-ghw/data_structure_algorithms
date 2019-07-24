package leetcode;

/**
 * @author Aayers-ghw
 * @date 2019/7/24 14:42
 */
public class Solution_51 {

    public int inversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        return inversePairsCore(array, copy, 0, array.length - 1);
    }

    private int inversePairsCore(int[] array, int[] copy, int start, int end) {
        if (start == end) {
            copy[start] = array[start];
            return 0;
        }
        int length = (end - start) >> 1;
        int left = inversePairsCore(array, copy, start, start + length) % 1000000007;
        int right = inversePairsCore(array, copy, start + length + 1, end) % 1000000007;

        int count = 0;
        int i = start + length;
        int j = end;
        int index = end;
        while (i >= start && j > start + length) {
            if (array[i] > array[j]) {
                copy[index--] = array[i--];
                count = (count + j - start - length) % 1000000007;

            } else {
                copy[index--] = array[j--];
            }
        }
        for (; i >= start; ) {
            copy[index--] = array[i--];
        }
        for (; j >= start + length + 1; ) {
            copy[index--] = array[j--];
        }
        return count + left + right;
    }
}
