package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 13:31
 */
public class Finder {

    /**
     * ����A������0��n������������������ȱʧ��һ��������������⣬�����趨���ƣ�
     * ʹ��һ�β����޷�ȡ������number��ĳ���������������ݡ�Ψһ�Ŀ��ò�����ѯ��
     * �����е�i��Ԫ�صĶ����Ƶĵ�jλ(���λΪ��0λ)���ò�����ʱ�临�Ӷ�Ϊ������������㷨����O(n)��ʱ�����ҵ��������
     * <p>
     * ����һ������number��������ʣ�µ�������С�������еĶ����Ƹ�λ��ֵ����A[0][1]��ʾʣ�µĵڶ���
     * �������ƴӵ͵��ߵĵڶ�λ��ͬʱ����һ��int n���������⡣�뷵��ȱʧ������
     *
     * @param numbers
     * @param n
     * @return
     */
    public int findMissing(int[][] numbers, int n) {
        // write code here
        for (int i = 0; i < n; ++i) {
            if (i % 2 != numbers[i][0]) {
                return i;
            }
        }
        return n;
    }
}
