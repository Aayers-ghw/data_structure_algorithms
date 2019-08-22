package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 21:47
 */
public class FinderIII {

    public int findString(String[] str, int n, String x) {
        // write code here
        if (str == null || str.length == 0 || x == null) {
            return -1;
        }
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (x.equals(str[mid])) {
                return mid;
            }
        }
        return -1;
    }
}
