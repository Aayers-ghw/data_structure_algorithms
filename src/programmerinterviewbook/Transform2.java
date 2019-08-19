package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 11:26
 */
public class Transform2 {

    /**
     * 编写一个函数，确定需要改变几个位，才能将整数A转变成整数B。
     * <p>
     * 给定两个整数int A，int B。请返回需要改变的数位个数。
     *
     * @param A
     * @param B
     * @return
     */
    public int calcCost(int A, int B) {
        // write code here
//        int cnt = 0;
//        int tmp = 1;
//        for (int i = 0; i < 32; ++i) {
//            if ((A & tmp) != (B & tmp)) {
//                cnt++;
//            }
//            tmp <<= 1;
//        }
//        return cnt;

        int sum = A ^ B;
        return Integer.bitCount(sum);
    }
}
