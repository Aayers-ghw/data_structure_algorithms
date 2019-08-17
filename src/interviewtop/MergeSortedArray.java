package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 15:30
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 || j >= 0) {
            if (i < 0) {
                nums1[end--] = nums2[j--];
            } else if (j < 0) {
                nums1[end--] = nums1[i--];
            } else {
                if (nums1[i] > nums2[j]) {
                    nums1[end--] = nums1[i--];
                } else {
                    nums1[end--] = nums2[j--];
                }
            }
        }
    }
}
