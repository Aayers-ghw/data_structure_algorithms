package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 11:12
 */
public class CloseNumber {

    /**
     * ��һ�������������ҳ�������Ʊ�ʾ��1�ĸ�����ͬ���Ҵ�С��ӽ�������������(һ���Դ�һ����С)
     * <p>
     * ����������int x���뷵��һ��vector�������������������С����ǰ������֤�𰸴��ڡ�
     *
     * @param x
     * @return
     */
    public int[] getCloseNumber(int x) {
        // write code here
        int min = x - 1;
        int max = x + 1;
        while (Integer.bitCount(min) != Integer.bitCount(x) && min >= 0) {
            min--;
        }
        while (Integer.bitCount(max) != Integer.bitCount(x)) {
            max++;
        }
        return new int[]{min, max};
    }
}
