package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 11:12
 */
public class Max {

    /**
     * ���дһ���������ҳ����������������Ǹ��������ǲ���ʹ��if-else�ȱȽϺ��ж��������
     * <p>
     * ��������int a��b���뷵�ؽϴ��һ��������������ͬ�򷵻�����һ����
     *
     * @param a
     * @param b
     * @return
     */
    public int getMax(int a, int b) {
        // write code here
        /**
         * ˼·��a��b�Ĳ�ľ���ֵ��abs(a - b)��Ȼ���ľ���ֵ����a��b�ĺͼ�Ϊ���ֵ��������
         * ͬ����������С��һ����a + b - abs(a - b)���ɡ�
         */
        return (a + b + (Math.abs(a - b))) / 2;
    }
}
