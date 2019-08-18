package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 10:10
 */
public class Transform {

    /**
     * ��һ����NxN�����ʾ��ͼ������ÿ��������һ��int��ʾ�����дһ���㷨��
     * �ڲ�ռ�ö����ڴ�ռ�������(����ʹ�û������)����ͼ��˳ʱ����ת90�ȡ�
     * <p>
     * ����һ��NxN�ľ��󣬺;���Ľ���N,�뷵����ת���NxN����,��֤NС�ڵ���500��ͼ��Ԫ��С�ڵ���256��
     *
     * @param mat
     * @param n
     * @return
     */
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        if (n < 2) {
            return mat;
        }
        int start = 0;
        int end = mat.length - 1;
        while (start < end) {
            int[] tmp = mat[start];
            mat[start] = mat[end];
            mat[end] = tmp;
            start++;
            end--;
        }
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[0].length; ++j) {
                if (i < j) {
                    int tmp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = tmp;
                }
            }
        }
        return mat;
    }
}
