package programmerinterviewbook;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 17:24
 */
public class FindPair {

    /**
     * �����һ����Ч�㷨���ҳ�����������֮��Ϊָ��ֵ�����������ԡ�
     * <p>
     * ����һ��int����A�������Сn�Լ�����ҵĺ�sum���뷵�غ�Ϊsum�������Եĸ�����
     * ��֤�����СС�ڵ���3000��
     *
     * @param A
     * @param n
     * @param sum
     * @return
     */
    public int countPairs(int[] A, int n, int sum) {
        // write code here
        if (A == null || A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        int count = 0;
        for (int i = 0, j = n - 1; i < j; ) {
            int s = A[i] + A[j];
            if (s == sum) {
                // 3 3 3�������
                if (A[i] == A[j]) {
                    int x = j - i + 1;
                    count += x * (x - 1) / 2;
                    break;
                } else { // 2 2 3 4 4 4�������
                    int k = i + 1;
                    while (k <= j && A[i] == A[k]) {
                        ++k;
                    }
                    int k2 = j-1;
                    while(k2 >= i && A[j] == A[k2]){
                        --k2;
                    }
                    count += (k - i) * (j - k2);
                    i = k;
                    j = k2;
                }
            } else if (s < sum) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
