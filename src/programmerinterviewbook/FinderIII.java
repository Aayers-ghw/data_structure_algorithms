package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 21:47
 */
public class FinderIII {

    /**
     * ��һ���Ź�����ַ������飬���������в�����һЩ���ַ����������һ���㷨���ҳ������ַ�����λ�á�
     * �㷨�Ĳ��Ҳ��ֵĸ��Ӷ�Ӧ��Ϊlog����
     * <p>
     * ����һ��string����str,ͬʱ���������Сn����Ҫ���ҵ�string x���뷵�ظô���λ��(λ�ô��㿪ʼ)��
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
