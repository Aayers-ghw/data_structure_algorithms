package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 21:47
 */
public class FinderIII {

    /**
     * 有一个排过序的字符串数组，但是其中有插入了一些空字符串，请设计一个算法，找出给定字符串的位置。
     * 算法的查找部分的复杂度应该为log级别。
     * <p>
     * 给定一个string数组str,同时给定数组大小n和需要查找的string x，请返回该串的位置(位置从零开始)。
     *
     * @param str
     * @param n
     * @param x
     * @return
     */
    public int findString(String[] str, int n, String x) {
        // write code here
        if (str == null || str.length == 0 || x == null) {
            return -1;
        }
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (str[mid].equals("")) {
                int index = mid;
                while (index >= left && str[index].equals("")) {
                    index--;
                }
                if (index < left) {
                    left = mid + 1;
                } else if (str[index].compareTo(x) == 0) {
                    return index;
                } else if (str[index].compareTo(x) > 0) {
                    right = index - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (str[mid].compareTo(x) == 0) {
                    return mid;
                }
                if (str[mid].compareTo(x) > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }
        return -1;
    }
}
